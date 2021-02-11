package com.example.hexarq.repositories

import com.example.hexarq.entities.ExampleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExampleRepository : JpaRepository<ExampleEntity, Long> {
}