package com.anonymious.retro.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import lombok.*


@Entity
@Builder(toBuilder = true)
data class CommentEntity(
    val type: Long? = null,
    val comment: String? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sprint")
    val idSprint: SprintEntity? = null,
)
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}