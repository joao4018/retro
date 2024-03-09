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
data class SprintEntity(
    val idAccess: Long? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_owner")
    val idOwner: OwnerEntity? = null,
)
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}