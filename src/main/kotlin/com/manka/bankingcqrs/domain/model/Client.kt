package com.manka.bankingcqrs.domain.model

import jakarta.persistence.*
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.util.*

@Table(name = "clients")
@Entity
class Client(
    @Id
    @GeneratedValue
    @JdbcTypeCode(SqlTypes.VARCHAR)
    val id: UUID,

    val name: String,
    val password: String,

    @OneToMany
    @JoinTable(
        joinColumns = [JoinColumn(name = "client_id")],
        inverseJoinColumns = [JoinColumn(name = "card_id")]
    )
    val cards: List<Card>,

    @OneToOne
    val account: Account
)
