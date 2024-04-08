package com.aaudat.sqaal

import net.sf.jsqlparser.parser.CCJSqlParserUtil
import net.sf.jsqlparser.statement.Statement

class SQLParser {
        /**
         * Parses the SQL String given as a parameter
         * @return [net.sf.jsqlparser.statement]
         * @exception net.sf.jsqlparser.parser.ParseException When String given as parameter does not follow correct SQL syntax
         */
        fun sqlParser(inputString: String): Statement {

            return try {
                val parsedAst = CCJSqlParserUtil.parse(inputString)

                parsedAst
            } catch (e: Exception) {
                throw e
            }
        }
}
