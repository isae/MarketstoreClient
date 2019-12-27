package me.iisaev.kotlin.marketstore_client

fun main() {
    val client = Client("localhost")
    val result = client.query(
        Params(
            10,
            "OHLCV",
            "1Min",
            "BTC"
        )
    )
    println(result.first())
}
