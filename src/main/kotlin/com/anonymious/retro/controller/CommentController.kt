package com.anonymious.retro.controller

import com.anonymious.retro.service.CommentService
import com.anonymious.retro.service.SprintService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/api", produces = [MediaType.APPLICATION_JSON_VALUE])
class CommentController (
    @Autowired private val commentService: CommentService,
) {
    @PostMapping("/create-comment")
    fun createSprint(
        @RequestParam(value = "id_sprint") idSprint: Long,
        @RequestParam(value = "type") type: Long,
        @RequestParam(value = "comment") comment: String,
        ) {
        commentService.createComment(idSprint, type, comment)
    }
}