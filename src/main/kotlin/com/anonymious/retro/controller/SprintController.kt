package com.anonymious.retro.controller

import com.anonymious.retro.service.SprintService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/api", produces = [MediaType.APPLICATION_JSON_VALUE])
class SprintController (
    @Autowired private val sprintService: SprintService ,
) {
    @PostMapping("/create-sprint")
    fun createSprint(
        @RequestParam(value = "id_access") idAccess: String,
        @RequestParam(value = "id_owner") idOwner: Long,
        ) {
        sprintService.createSprint(idAccess, idOwner)
    }
}