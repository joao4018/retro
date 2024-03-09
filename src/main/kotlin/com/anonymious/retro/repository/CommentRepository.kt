package com.anonymious.retro.repository

import com.anonymious.retro.entity.CommentEntity
import com.anonymious.retro.entity.OwnerEntity
import com.anonymious.retro.entity.SprintEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CommentRepository : JpaRepository<CommentEntity, Long> {
    fun findAllByIdSprint(sprintEntity: SprintEntity): Optional<List<CommentEntity>>
}