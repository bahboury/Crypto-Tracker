package com.plcoding.cryptotracker.crypto.domain.entities

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,
    val priceUsd: Double,
    val changePercentage24h: Double,
)