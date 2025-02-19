fun main (){

    var n= readln()
    for(i in 0 until n.toInt()) {
        val valores = readln().split(" ").map { it.toInt() }
        val agrupados = valores.groupBy { it }
          if (agrupados.keys.sum()<0){
         println("NO")}else{ println("SI") }

    }
}
