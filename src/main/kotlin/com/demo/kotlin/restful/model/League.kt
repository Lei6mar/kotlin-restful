package com.demo.kotlin.restful.model

import javax.persistence.*

@Entity
@Table(name = "leagues")
data class League(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Long = 0,

        @Column(name = "name")
        val name: String = "",

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "league")
        val teams: List<Team> = ArrayList()
)