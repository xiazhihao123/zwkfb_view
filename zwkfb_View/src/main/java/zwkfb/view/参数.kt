package zwkfb.view

fun 测试(args: Array<String>) {
    println("参数个数：${args.size}")
}

fun 测试(args: List<String> = emptyList(), a: Int = 0) {
    println("参数个数：${args.size}，a：$a")
}

fun main(args: Array<String>) {
    测试(args)
}