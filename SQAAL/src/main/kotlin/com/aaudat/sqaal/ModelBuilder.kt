package com.aaudat.sqaal


import net.sf.jsqlparser.statement.Statement

class ModelBuilder {
    private var sqlObject: Statement? = null
    private var tsString: String? = null
    private var propertyString: String? = null

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

    fun build(): Model {
        // Check if any property is null and use the previous value as default
        val finalSQLObject = sqlObject ?: this.sqlObject
        val finalTSString = tsString ?: this.tsString
        val finalPropertyString = propertyString ?: this.propertyString

        return Model(finalSQLObject, finalTSString, finalPropertyString)
    }
}

class Model(
    val sqlObject: Statement?,
    val tsString: String?,
    val propertyString: String?
)
