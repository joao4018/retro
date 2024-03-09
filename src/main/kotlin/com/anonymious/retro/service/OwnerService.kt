package com.anonymious.retro.service

import com.anonymious.retro.entity.OwnerEntity
import com.anonymious.retro.repository.OwnerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OwnerService(
    @Autowired private val ownerRepository: OwnerRepository,
){
    fun createOwner() {
        ownerRepository.save(OwnerEntity())
    }
    fun getOwner(id: Long) {
        ownerRepository.findById(id)
    }
}