package com.aaudat.sqaal

import net.sf.jsqlparser.parser.CCJSqlParserUtil
import net.sf.jsqlparser.statement.select.PlainSelect

class SQLParser {
    companion object {
        /**
         * Parses the SQL String given as a parameter
         * @return Parsed SQL String - todo: Decide upon correct return type
         * @exception net.sf.jsqlparser.parser.ParseException When String given as parameter does not follow correct SQL syntax
         */
        fun SQLParser(inputString: String): String {

            return try {
                val select = CCJSqlParserUtil.parse(inputString) as PlainSelect
                "$select"
            } catch (e: Exception) {
                throw e
            }
        }
    }
}
