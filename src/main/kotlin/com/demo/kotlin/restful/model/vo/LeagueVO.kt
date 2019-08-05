package com.demo.kotlin.restful.model.vo

import com.fasterxml.jackson.annotation.JsonIgnore

data class LeagueVO(
        val id: Long = 0,

        val name: String = "",

        @JsonIgnore
        val teams: List<TeamVO> = ArrayList()
)