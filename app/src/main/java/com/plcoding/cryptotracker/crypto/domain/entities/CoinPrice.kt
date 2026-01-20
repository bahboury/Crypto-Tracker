package com.plcoding.cryptotracker.crypto.domain.entities

import java.time.ZonedDateTime

data class CoinPrice(
    val priceUsd: Double,
    val dateTime: ZonedDateTime
)
