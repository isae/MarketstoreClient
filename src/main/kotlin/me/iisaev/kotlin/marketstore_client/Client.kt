package me.iisaev.kotlin.marketstore_client

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import java.net.URL

class Client(url: String, port: Int = 5993) {
    private val serverUrl = "url:${port}"
    private val client = HttpClient()

    suspend fun query(params: Params): QueryResult {
       return client.get<ByteArray>(serverUrl)
    }
}