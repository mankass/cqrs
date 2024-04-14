package com.manka.bankingcqrs.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.math.BigDecimal
import java.util.UUID

@Table(name = "accounts")
@Entity
class Account(

    @Id
    @GeneratedValue
    @JdbcTypeCode(SqlTypes.VARCHAR)
    val id: UUID,

    val number:String,

    val balance:BigDecimal

) {
}