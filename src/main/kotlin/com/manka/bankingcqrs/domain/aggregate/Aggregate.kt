package com.manka.bankingcqrs.domain.aggregate

import java.util.UUID

abstract class Aggregate (
    val uuid: UUID
)