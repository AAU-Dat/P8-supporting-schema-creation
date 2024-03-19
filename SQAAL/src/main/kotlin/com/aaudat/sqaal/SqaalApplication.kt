package com.aaudat.sqaal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.shell.command.annotation.CommandScan


@SpringBootApplication
class SqaalApplication

fun main(args: Array<String>) {
    runApplication<SqaalApplication>(*args)
}
