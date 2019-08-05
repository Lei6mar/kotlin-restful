package com.demo.kotlin.restful.service

import com.demo.kotlin.restful.model.vo.TeamVO
import com.demo.kotlin.restful.repository.TeamRepository
import org.springframework.stereotype.Service

@Service
class TeamServiceImpl(private val teamRepository: TeamRepository) : TeamService {

    override fun save(teamVO: TeamVO): TeamVO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): List<TeamVO> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findById(id: Long): TeamVO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateById(id: Long, teamVO: TeamVO) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteById(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}