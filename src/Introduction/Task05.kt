package Introduction

/**********************************************************************************************
 * String templates
 *
 * The following pattern matches a date in the format 13.06.1992 (two digits, a dot, two digits, a dot, four digits):
 *
 * fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""
 * Using the month variable rewrite this pattern in such a way
 * that it matches the date in the format 13 JUN 1992
 * (two digits, a whitespace, a month abbreviation, a whitespace, four digits).
 ***********************************************************************************************/

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""
