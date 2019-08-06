package com.demo.kotlin.restful.controller

import com.demo.kotlin.restful.model.vo.LeagueVO
import com.demo.kotlin.restful.service.LeagueService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class LeagueController(private val leagueService: LeagueService){

    @GetMapping("/leagues")
    fun getAllLeagues(): ResponseEntity<List<LeagueVO>> =
            ResponseEntity(leagueService.findAll(), HttpStatus.OK)

    @PostMapping("/leagues")
    fun createNewLeague(@RequestBody leagueVO: LeagueVO): ResponseEntity<LeagueVO> =
            ResponseEntity(leagueService.save(leagueVO), HttpStatus.OK)

    @GetMapping("/leagues/{id}")
    fun getLeagueById(@PathVariable(value = "id") leagueId: Long) : ResponseEntity<LeagueVO> {
        val leagueVO = leagueService.findById(leagueId)
        return if(leagueVO.id > 0){
            ResponseEntity(leagueVO, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @DeleteMapping("/leagues/{id}")
    fun deleteLeagueById(@PathVariable(value = "id") leagueId: Long): ResponseEntity<Void> {
        leagueService.deleteById(leagueId)
        return ResponseEntity(HttpStatus.OK)
    }

    @PutMapping("/leagues/{id}")
    fun updateLeagueById(@PathVariable(value = "id") leagueId: Long, @RequestBody @Valid leagueVO: LeagueVO):
            ResponseEntity<Void> {
        leagueService.updateById(leagueId, leagueVO)
        return ResponseEntity(HttpStatus.OK)
    }
}