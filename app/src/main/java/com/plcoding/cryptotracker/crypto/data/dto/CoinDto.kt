package com.plcoding.cryptotracker.crypto.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: String,
    val rank: String,
    val symbol: String,
    val name: String,
    val marketCapUsd: String,
    val priceUsd: String,
    val changePercent24Hr: String,
)
