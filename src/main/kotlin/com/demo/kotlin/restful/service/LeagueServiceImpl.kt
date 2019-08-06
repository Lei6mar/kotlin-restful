package com.demo.kotlin.restful.service

import com.demo.kotlin.restful.model.League
import com.demo.kotlin.restful.model.vo.LeagueVO
import com.demo.kotlin.restful.repository.LeagueRepository
import org.springframework.stereotype.Service

@Service
class LeagueServiceImpl(private val leagueRepository: LeagueRepository) : LeagueService {

    override fun save(leagueVO: LeagueVO): LeagueVO {
        val league = leagueRepository.save(League(leagueVO.id, leagueVO.name))
        return leagueToLeagueVo(league)
    }

    override fun findAll(): List<LeagueVO> {
        val leagues = leagueRepository.findAll()
        val leaguesVO = ArrayList<LeagueVO>()
        for (league in leagues){
            leaguesVO.add(leagueToLeagueVo(league))
        }
        return leaguesVO
    }

    override fun findById(id: Long): LeagueVO {
        val league = leagueRepository.findById(id).orElse(League())
        return leagueToLeagueVo(league)
    }

    override fun updateById(id: Long, leagueVO: LeagueVO) {
        val league = leagueRepository.findById(id).orElse(League())
        if(league.id > 0){
            leagueRepository.save(League(id, leagueVO.name))
        }
    }

    override fun deleteById(id: Long) {
        leagueRepository.deleteById(id)
    }

    private fun leagueToLeagueVo(league: League):LeagueVO {
        return LeagueVO(league.id, league.name)
    }
}