package com.manka.bankingcqrs.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.math.BigDecimal
import java.util.*


@Table
@Entity
class Trancaction(

    @Id
    @GeneratedValue
    @JdbcTypeCode(SqlTypes.VARCHAR)
    val id: UUID,


    @ManyToOne
    val from: Card,

    @ManyToOne
    val to: Card,

    val amount: BigDecimal
)