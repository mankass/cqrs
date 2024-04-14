package com.manka.bankingcqrs.events

import com.manka.bankingcqrs.domain.aggregate.Aggregate

interface Event {
    fun apply(aggregate:Aggregate)
}