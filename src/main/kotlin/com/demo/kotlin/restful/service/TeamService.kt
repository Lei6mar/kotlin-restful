package com.demo.kotlin.restful.service

import com.demo.kotlin.restful.model.vo.TeamVO

interface TeamService {
    fun save(teamVO: TeamVO): TeamVO
    fun findAll(): List<TeamVO>
    fun findById(id: Long): TeamVO
    fun updateById(id: Long, teamVO: TeamVO)
    fun deleteById(id: Long)
}