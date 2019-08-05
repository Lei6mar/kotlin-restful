package com.demo.kotlin.restful.service

import com.demo.kotlin.restful.model.League
import com.demo.kotlin.restful.model.vo.LeagueVO
import com.demo.kotlin.restful.repository.LeagueRepository
import org.springframework.stereotype.Service

@Service
class LeagueServiceImpl(private val leagueRepository: LeagueRepository) : LeagueService {

    override fun save(leagueVO: LeagueVO): LeagueVO {
        val league = leagueRepository.save(League(leagueVO.id, leagueVO.name))
        return LeagueVO(league.id, league.name)
    }

    override fun findAll(): List<LeagueVO> {
        val leagues = leagueRepository.findAll()
        val leaguesVO = ArrayList<LeagueVO>()
        for (league in leagues){
            leaguesVO.add(LeagueVO(league.id, league.name))
        }
        return leaguesVO
    }

    override fun findById(id: Long): LeagueVO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateById(id: Long, leagueVO: LeagueVO) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteById(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}