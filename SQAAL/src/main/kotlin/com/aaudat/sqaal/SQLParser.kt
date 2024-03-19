package com.aaudat.sqaal

import net.sf.jsqlparser.parser.CCJSqlParserUtil
import net.sf.jsqlparser.statement.select.PlainSelect

class SQLParser {
    companion object {
        fun SQLParserTest(inputString: String): String {

            return try {
                val select = CCJSqlParserUtil.parse(inputString) as PlainSelect
                "$select"
            } catch (e: Exception) {
                throw e
            }
        }
    }
}
