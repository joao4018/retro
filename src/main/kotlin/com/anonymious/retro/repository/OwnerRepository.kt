package com.anonymious.retro.repository

import com.anonymious.retro.entity.OwnerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OwnerRepository : JpaRepository<OwnerEntity, Long> {
}