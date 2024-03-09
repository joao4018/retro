package com.anonymious.retro.repository

import com.anonymious.retro.entity.OwnerEntity
import com.anonymious.retro.entity.SprintEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SprintRepository : JpaRepository<SprintEntity, Long> {
}