package com.manka.bankingcqrs.events

import com.manka.bankingcqrs.domain.model.ObjectConverter
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.time.LocalDateTime
import java.util.UUID

@Table(name = "events")
@Entity
abstract class AbstractEvent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long,
    @JdbcTypeCode(SqlTypes.VARCHAR)
    open val aggregateId: UUID,
    @Enumerated(value = EnumType.STRING)
    open val eventType: EventType,
    @CreationTimestamp
    open val timestamp: LocalDateTime,
    @JdbcTypeCode(SqlTypes.JSON)
    @Convert(converter = ObjectConverter::class)
    open val payload: Any
) : Event