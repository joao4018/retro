package com.anonymious.retro.service

import com.anonymious.retro.entity.CommentEntity
import com.anonymious.retro.entity.OwnerEntity
import com.anonymious.retro.entity.SprintEntity
import com.anonymious.retro.repository.CommentRepository
import com.anonymious.retro.repository.SprintRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CommentService(
    @Autowired private val commentRepository: CommentRepository,
    @Autowired private val sprintRepository: SprintRepository,
){
    fun createComment(idAccess: String, type: Long, comment: String) {
        val sprintEntity: SprintEntity = sprintRepository.findSprintEntityByIdAccess(idAccess).orElseThrow()
        commentRepository.save(CommentEntity(type, comment, sprintEntity))
    }
}