package com.aaudat.sqaal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import dk.brics.automaton.*

@SpringBootApplication
class SqaalApplication

fun main(args: Array<String>) {
    runApplication<SqaalApplication>(*args)
}
