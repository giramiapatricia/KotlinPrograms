/**
 * fibonacci series
 */
fun fibonacci():MutableList<Int>{
    var start:Int = 0
    var sum:Int = 0
    var fibonacci = mutableListOf(1,1)
    while (sum <= 20){
        sum = fibonacci[start] + fibonacci[start+1]
        fibonacci.add(sum)
        start++
        
    }
    println(fibonacci)
    return fibonacci
    }
fun main() {
    fibonacci()
}
