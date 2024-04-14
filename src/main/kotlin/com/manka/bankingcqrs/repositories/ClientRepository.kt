package com.manka.bankingcqrs.repositories

import com.manka.bankingcqrs.domain.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ClientRepository : JpaRepository<Client, UUID> {
}