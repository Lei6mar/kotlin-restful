package com.demo.kotlin.restful.controller

import com.demo.kotlin.restful.model.vo.LeagueVO
import com.demo.kotlin.restful.service.LeagueService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class LeagueController(private val leagueService: LeagueService){

    @GetMapping("/leagues")
    fun getAllLeagues(): ResponseEntity<List<LeagueVO>> =
            ResponseEntity(leagueService.findAll(), HttpStatus.OK)

}