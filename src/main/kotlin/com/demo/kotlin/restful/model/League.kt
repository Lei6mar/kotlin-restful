package com.demo.kotlin.restful.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "leagues")
data class League(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,

        @get:NotBlank
        var name: String = "",

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "league")
        var teams: List<Team> = ArrayList()
)