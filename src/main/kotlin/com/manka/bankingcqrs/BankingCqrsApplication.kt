package com.manka.bankingcqrs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankingCqrsApplication

fun main(args: Array<String>) {
    runApplication<BankingCqrsApplication>(*args)
}
