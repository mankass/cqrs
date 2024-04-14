package com.manka.bankingcqrs.events

import com.manka.bankingcqrs.domain.aggregate.Aggregate
import jakarta.persistence.Entity
import java.time.LocalDateTime
import java.util.*

@Entity
class ClientCreateEvent(
    id: Long, aggregateId: UUID, eventType: EventType, timestamp: LocalDateTime, payload: Any,
) :
    AbstractEvent(
        id, aggregateId, EventType.CLIENT_CREATE,
        timestamp,
        payload
    ) {
    override fun apply(aggregate: Aggregate) {
        TODO("Not yet implemented")
    }
}