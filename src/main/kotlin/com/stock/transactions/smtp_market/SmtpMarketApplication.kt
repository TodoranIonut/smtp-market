package com.stock.transactions.smtp_market

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmtpMarketApplication

fun main(args: Array<String>) {
	runApplication<SmtpMarketApplication>(*args)
}
