package com.manka.bankingcqrs.repositories

import com.manka.bankingcqrs.domain.model.Account
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AccountRepository:JpaRepository<Account,UUID> {
}