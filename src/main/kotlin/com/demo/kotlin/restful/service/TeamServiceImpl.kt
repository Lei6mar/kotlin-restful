package com.demo.kotlin.restful.service

import com.demo.kotlin.restful.model.League
import com.demo.kotlin.restful.model.Team
import com.demo.kotlin.restful.model.vo.LeagueVO
import com.demo.kotlin.restful.model.vo.TeamVO
import com.demo.kotlin.restful.repository.TeamRepository
import org.springframework.stereotype.Service

@Service
class TeamServiceImpl(private val teamRepository: TeamRepository) : TeamService {

    override fun save(teamVO: TeamVO): TeamVO {
        val team = teamRepository.save(Team(teamVO.id,teamVO.name,teamVO.points, League(teamVO.league.id,
                teamVO.league.name)))
        return teamToTeamVo(team)

    }

    override fun findAll(): List<TeamVO> {
        val teams = teamRepository.findAll()
        val teamsVO = ArrayList<TeamVO>()
        for (team in teams){
            teamsVO.add(teamToTeamVo(team))
        }
        return teamsVO
    }

    override fun findById(id: Long): TeamVO {
        val team = teamRepository.findById(id).orElse(Team())
        return teamToTeamVo(team)
    }

    override fun updateById(id: Long, teamVO: TeamVO) {
        val team = teamRepository.findById(id).orElse(Team())
        if(team.id > 0){
            teamRepository.save(Team(id,teamVO.name,teamVO.points, League(teamVO.league.id, teamVO.league.name)))
        }
    }

    override fun deleteById(id: Long) {
        teamRepository.deleteById(id)
    }

    private fun teamToTeamVo(team:Team):TeamVO{
        return TeamVO(team.id,team.name,team.points, LeagueVO(team.league.id, team.league.name))
    }

}