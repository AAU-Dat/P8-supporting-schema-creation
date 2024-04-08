package com.aaudat.sqaal


import net.sf.jsqlparser.statement.Statement
import net.sf.jsqlparser.parser.CCJSqlParserUtil
import net.sf.jsqlparser.statement.create.table.CreateTable


class ModelBuilder {
    private var sqlObject: Statement? = null
    private var tsString: String? = null
    private var propertyString: String? = null
    private var tables: MutableList<String> = mutableListOf()
    private var columnsMap: MutableMap<String, MutableList<String>> = mutableMapOf()
    private var sqlSchema: Statement? = null

    fun withSQL(sqlObject: Statement): ModelBuilder {
        this.sqlObject = sqlObject
        return this
    }

    fun withTS(tsString: String): ModelBuilder {
        this.tsString = tsString
        return this
    }

    fun withProperty(propertyString: String): ModelBuilder {
        this.propertyString = propertyString
        return this
    }

    fun withSchema(sqlSchema: Statement): ModelBuilder {
        this.sqlSchema = sqlSchema
        return this
    }

    fun getTables(): List<String> {
        return tables.toList()
    }

    fun getColumns(tableName: String): List<String>? {
        return columnsMap[tableName]
    }

    fun build(): Model {
        // Check if any property is null and use the previous value as default
        val finalSQLObject = sqlObject ?: this.sqlObject
        val finalTSString = tsString ?: this.tsString
        val finalPropertyString = propertyString ?: this.propertyString
        val finalSQLSchema = sqlSchema ?: this.sqlSchema

        return Model(finalSQLObject, finalTSString, finalPropertyString, finalSQLSchema)
    }
}

class Model(
    val sqlObject: Statement? = null,
    val tsString: String? = null,
    val propertyString: String? = null,
    val sqlSchema: Statement? = null
)

