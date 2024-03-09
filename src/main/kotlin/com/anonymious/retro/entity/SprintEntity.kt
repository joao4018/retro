package com.anonymious.retro.entity

import lombok.*
import javax.persistence.*


@Entity
@Builder(toBuilder = true)
data class SprintEntity(
    @Column(unique = true)
    val idAccess: String? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_owner")
    val idOwner: OwnerEntity? = null,
)
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}