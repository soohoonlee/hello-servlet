package dev.springrunner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@SpringBootApplication
@ServletComponentScan
class HelloServletApplication

fun main(args: Array<String>) {
    runApplication<HelloServletApplication>(*args)
}
