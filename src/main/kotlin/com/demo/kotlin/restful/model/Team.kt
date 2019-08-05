package com.demo.kotlin.restful.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "teams")
data class Team (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Long = 0,

        @Column(name = "name")
        val name: String = "",

        @Column(name = "points")
        val points: Byte = 0,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "leagues_id")
        val league: League = League()
)
