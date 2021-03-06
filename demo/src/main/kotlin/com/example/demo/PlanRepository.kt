package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

//@RepositoryRestResource
@Repository
interface PlanRepository : JpaRepository<Plan, Long> {
}