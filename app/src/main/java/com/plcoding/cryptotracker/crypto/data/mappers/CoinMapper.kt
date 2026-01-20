package com.plcoding.cryptotracker.crypto.data.mappers

import com.plcoding.cryptotracker.crypto.data.dto.CoinDto
import com.plcoding.cryptotracker.crypto.data.dto.CoinPriceDto
import com.plcoding.cryptotracker.crypto.domain.entities.Coin
import com.plcoding.cryptotracker.crypto.domain.entities.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank.toInt(),
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd.toDouble(),
        priceUsd = priceUsd.toDouble(),
        changePercentage24h = changePercent24Hr.toDouble()
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochSecond(time)
            .atZone(ZoneId.systemDefault())
    )
}