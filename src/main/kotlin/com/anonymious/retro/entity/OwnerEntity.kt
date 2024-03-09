package com.anonymious.retro.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.*

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
class OwnerEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
)