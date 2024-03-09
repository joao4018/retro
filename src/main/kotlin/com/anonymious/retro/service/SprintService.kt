package com.anonymious.retro.service

import com.anonymious.retro.entity.OwnerEntity
import com.anonymious.retro.entity.SprintEntity
import com.anonymious.retro.repository.SprintRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SprintService(
    @Autowired private val sprintRepository: SprintRepository,
){
    fun createSprint(idAccess: String, idOwner: Long) {
        sprintRepository.save(SprintEntity(idAccess, OwnerEntity(idOwner)))
    }
}