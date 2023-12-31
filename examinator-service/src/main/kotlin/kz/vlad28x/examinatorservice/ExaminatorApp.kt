package kz.vlad28x.examinatorservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class ExaminatorApp

fun main(args: Array<String>) {
    runApplication<ExaminatorApp>(*args)
}
