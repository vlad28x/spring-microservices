package kz.vlad28x.historyservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class HistoryApp

fun main(args: Array<String>) {
    runApplication<HistoryApp>(*args)
}
