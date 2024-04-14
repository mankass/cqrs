package com.manka.bankingcqrs.repositories

import com.manka.bankingcqrs.events.AbstractEvent
import com.manka.bankingcqrs.events.Event
import org.springframework.data.jpa.repository.JpaRepository

interface EventRepository : JpaRepository<AbstractEvent, Long> {
}