fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    val map = mutableMapOf<Int,Int>()
    a.forEach {
        if(!map.contains(it)){
            map[it] = it
           // println(map[it])
        }
        else{
            map.remove(it)
        }
    }
    println(map)

    var lonely = mutableListOf<Int>()
    for ((key,entry) in map) {
        lonely[key] = entry
    }

    println(lonely)
    return lonely[lonely.size-1]
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}
