package com.anonymious.retro.controller

import com.anonymious.retro.service.OwnerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
}