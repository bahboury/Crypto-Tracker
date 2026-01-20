package com.plcoding.cryptotracker.crypto.domain.entities

import com.plcoding.cryptotracker.crypto.data.dto.CoinDto
import kotlinx.serialization.Serializable

@Serializable
data class CoinResponseDto(
    val data: List<CoinDto>
)
