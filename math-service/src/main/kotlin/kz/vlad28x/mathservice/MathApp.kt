package kz.vlad28x.mathservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class MathApp

fun main(args: Array<String>) {
    runApplication<MathApp>(*args)
}
