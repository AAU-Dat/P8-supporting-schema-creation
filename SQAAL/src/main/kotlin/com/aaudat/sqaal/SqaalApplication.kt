package com.aaudat.sqaal

import com.google.ortools.Loader;
import com.google.ortools.linearsolver.*
import com.google.ortools.linearsolver.MPSolver.ResultStatus
import dk.brics.automaton.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import dk.brics.automaton.*

@SpringBootApplication
class SqaalApplication

fun main(args: Array<String>) {
    runApplication<SqaalApplication>(*args)
}
