fun main(){
    var n = 6
    for (i in 1..n){
        for(j in 1..n-i){
            print("* ")
        }
        println()
    }
}