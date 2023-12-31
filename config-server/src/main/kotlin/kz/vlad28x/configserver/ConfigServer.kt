package kz.vlad28x.configserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
class ConfigServer

fun main(args: Array<String>) {
    runApplication<ConfigServer>(*args)
}
