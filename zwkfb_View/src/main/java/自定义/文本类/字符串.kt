package 自定义.文本类

import kotlin.text.replace
import kotlin.text.trim

fun String.去除HTML标签(): String
        = replace(Regex("<[^>]+>"), "").trim()