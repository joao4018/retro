package com.anonymious.retro.entity

import javax.persistence.*

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