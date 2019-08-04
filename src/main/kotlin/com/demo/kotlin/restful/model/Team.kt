package com.demo.kotlin.restful.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "teams")
data class Team (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,

        @get: NotBlank
        var name: String = "",

        @get: NotBlank
        var points: Byte = 0,

        @JoinColumn(name = "league_id")
        var league: League = League()


)
