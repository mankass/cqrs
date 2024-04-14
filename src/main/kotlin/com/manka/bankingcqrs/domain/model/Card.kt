package com.manka.bankingcqrs.domain.model

import jakarta.persistence.*
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.util.UUID

@Entity
@Table(name = "cards")
class Card(

    @Id
    @GeneratedValue
    @JdbcTypeCode(SqlTypes.VARCHAR)
    val id: UUID,

    val number: String,

    val date: String,

    val cvv: String,

    @OneToMany
    @JoinTable(
        joinColumns = [JoinColumn(name = "card_id")],
        inverseJoinColumns = [JoinColumn(name = "transaction_id")]
    )
    val transactionals: List<Trancaction>,

    @ManyToOne
    val account: Account
)
