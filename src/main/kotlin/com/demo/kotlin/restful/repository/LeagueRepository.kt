package com.demo.kotlin.restful.repository

import com.demo.kotlin.restful.model.League
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LeagueRepository: JpaRepository<League, Long>