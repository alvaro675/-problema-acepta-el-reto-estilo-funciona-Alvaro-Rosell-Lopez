fun main(){

    var n= readln().toInt()
        for (j in 0..n-1){
            var arriba=0
            var abajo=0
            val nMuros=readln().toInt()

            val altura= readln().split(" ").map { it }
            for (i in 1 until nMuros){
            altura.run{
                if (this[i-1]<this[i]){arriba++}else{if (this[i-1]>this[i]){ abajo++}else{} }
            }
            }
            println("$arriba $abajo")

        }
    }
