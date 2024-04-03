package com.aaudat.sqaal

import org.springframework.shell.command.annotation.Command
import org.springframework.shell.command.annotation.Option
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStream
import kotlin.io.path.Path
import kotlin.io.path.readText

@Command
/**
 * Contains all custom commands used by the spring framework
 */
class Commands {
    private val sqlParser: SQLParser = SQLParser()
    private val modelBuilder: ModelBuilder = ModelBuilder()
    private var model: Model = Model()

    @Command(command = ["hello"], description = "Hello World command", group = "Testing Commands")
    /**
     * Testing function printing "Hello world"
     * @return The String: "Hello world"
     */
    public fun hello(): String {
        return "Hello world"
    }

    @Command(command = ["lmodel"], description = "Main function for loading model", group = "Main Commands")
    /**
     * Main function for loading the model
     * Receives .sql file and uses the JSQLParser to parse the file
     * Receives .prop file and parses the file
     * Receives .ts file and parses the file
     * @exception FileNotFoundException If function cannot find the file given as argument
     * @param sqlPath Name of the .sql file containing the SQL query to be parsed
     * @param propPath Name of the .prop file containing the property to be parsed
     * @param tsPath Name of the .ts file containing the transition system to be parsed
     * @return Nothing, but builds the model
     */
    public fun loadModel(
        @Option(
            longNames = ["sql"],
            label = "SQL Path",
            description = "Name of file containing SQL query",
            required = true
        ) sqlPath: String,
        @Option(
            longNames = ["prop"],
            label = "Property Path",
            description = "Name of file containing SQL query",
            required = true
        ) propPath: String,
        @Option(
            longNames = ["ts"],
            label = "TS path",
            description = "Name of file containing SQL query",
            required = true
        ) tsPath: String
    ) {
        //load sql
        loadSQL(sqlPath)

        //load property
        loadProp(propPath)

        //load transition system
        loadTS(tsPath)
    }

    @Command(command = ["lsql"], description = "Main function for loading SQL")
    /**
     * Main function for loading SQL
     * Receives .sql file and uses the JSQLParser to parse the file
     * @exception FileNotFoundException If function cannot find the file given as argument
     * @param filepath Name of the .sql file containing the SQL query to be parsed
     * @return Nothing, but builds the model
     */
    public fun loadSQL(
        @Option(
            longNames = ["arg"],
            label = "SQLPath",
            description = "Path of file containing SQL query"
        ) filepath: String
    ) {
        try {
            val file = Path(filepath).readText()
            val parsedSQL = sqlParser.sqlParser(file)
            modelBuilder.withSQL(parsedSQL)
            model = modelBuilder.build()
            println("SQL file loaded successfully!")
        } catch (e: FileNotFoundException) {
            throw e
        } catch (e: Exception) {
            throw e
        }
    }

    @Command(command = ["lprop"], description = "Main function for loading property")
    public fun loadProp(
        @Option(
            longNames = ["arg"],
            label = "propPath",
            description = "Path of file containing property"
        ) filepath: String
    ) {
        try {
            modelBuilder.withProperty(filepath)
            model = modelBuilder.build()
            println("property file loaded successfully!")
        } catch (e: FileNotFoundException) {
            throw e
        } catch (e: Exception) {
            throw e
        }
    }

    @Command(command = ["lts"], description = "Main function for loading transition system")
    public fun loadTS(
        @Option(
            longNames = ["arg"],
            label = "tsPath",
            description = "Path of file containing transition system"
        ) tspath: String
    ) {
        try {
            modelBuilder.withTS(tspath)
            model = modelBuilder.build()
            println("transition system file loaded successfully!")
        } catch (e: FileNotFoundException) {
            throw e
        } catch (e: Exception) {
            throw e
        }
    }
}

