package com.aaudat.sqaal

import com.google.ortools.Loader;
import com.google.ortools.linearsolver.*
import com.google.ortools.linearsolver.MPSolver.ResultStatus
import dk.brics.automaton.*
import net.sf.jsqlparser.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SqaalApplication

fun main(args: Array<String>) {
    runApplication<SqaalApplication>(*args)
}
