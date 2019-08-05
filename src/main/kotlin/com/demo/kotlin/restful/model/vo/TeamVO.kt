package com.demo.kotlin.restful.model.vo

data class TeamVO (
        val id: Long = 0,

        val name: String = "",

        val points: Byte = 0,

        val league: LeagueVO = LeagueVO()
)