package com.demo.kotlin.restful.repository

import com.demo.kotlin.restful.model.Team
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeamRepository: JpaRepository<Team, Long>