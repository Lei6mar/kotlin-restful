package com.demo.kotlin.restful.controller

import com.demo.kotlin.restful.model.vo.TeamVO
import com.demo.kotlin.restful.service.TeamService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TeamController(private val teamService: TeamService) {

    @GetMapping("/teams")
    fun getAllTeams(): ResponseEntity<List<TeamVO>> =
            ResponseEntity(teamService.findAll(),HttpStatus.OK)
}