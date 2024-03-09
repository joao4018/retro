package com.anonymious.retro.controller

import com.anonymious.retro.entity.OwnerEntity
import com.anonymious.retro.service.OwnerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/api", produces = [MediaType.APPLICATION_JSON_VALUE])
class OwnerController (
    @Autowired private val ownerService: OwnerService,
) {
    @PostMapping("/create-owner")
    fun createOwner(
    ) {
        ownerService.createOwner()
    }
    @GetMapping("/get-owner")
    fun getOwner(@RequestParam id: Long
    ): OwnerEntity {
        return ownerService.getOwner(id)
    }
}