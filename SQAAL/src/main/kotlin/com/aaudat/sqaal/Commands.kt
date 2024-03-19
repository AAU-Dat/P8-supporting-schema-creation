package com.aaudat.sqaal

import org.springframework.shell.command.annotation.Command
import org.springframework.shell.command.annotation.Option
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStream

@Command
/**
 * Contains all custom commands used by the spring framework
 */
class Commands {
    @Command(command = ["hello"], description = "Hello World command", group = "Testing Commands")
    /**
     * Testing function printing "Hello world"
     * @return The String: "Hello world"
     */
    public fun hello(): String {
        return "Hello world"
    }

    @Command(command = ["parse"], description = "Main function for parsing SQL", group = "Main Commands")
    /**
     * Main function for parsing SQL queries
     * Receives .sql file and uses the JSQLParser to parse the file
     * @exception FileNotFoundException If function cannot find the file given as argument
     * @param filename Name of the .sql file containing the SQL query to be parsed
     * @return TBD - String for now
     */
    public fun parse(
        @Option(
            longNames = ["arg"],
            label = "FileName",
            description = "Name of file containing SQL query"
        ) filename: String
    ): String {
        return try {
            val inputStream: InputStream = File("SQAAL/src/main/kotlin/com/aaudat/sqaal/$filename.sql").inputStream()
            println("File '$filename.sql' succesfully loaded!")
            val inputString = inputStream.bufferedReader().use { it.readText() }
            println("\nContents of file: $filename.sql")
            println("-------------------------------")
            val parsedAST = SQLParser.sqlParser(inputString)
            "$parsedAST"
        } catch (e: FileNotFoundException) {
            println("FILE ERROR - Could not find file '$filename.sql'")
            throw e
        } catch (e: Exception) {
            println("PARSING ERROR - Make sure the file '$filename.sql' contains valid SQL syntax")
            throw e
        }
    }
}

