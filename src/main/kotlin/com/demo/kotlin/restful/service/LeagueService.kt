package com.demo.kotlin.restful.service

import com.demo.kotlin.restful.model.vo.LeagueVO

interface LeagueService {
    fun save(leagueVO: LeagueVO): LeagueVO
    fun findAll(): List<LeagueVO>
    fun findById(id: Long): LeagueVO
    fun updateById(id: Long, leagueVO: LeagueVO)
    fun deleteById(id: Long)
}