package com.example.demo

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Plan(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = null,
        var title : String? = null,
        var content : String? = null,
        var startTime : LocalDateTime? = null,
        var endTime : LocalDateTime? = null
)