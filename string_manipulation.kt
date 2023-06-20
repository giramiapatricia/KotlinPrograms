/**
 * convert string to upper or lower as per input argument(upper,lower,snake,camel)
 * returns  WOOW and woow
 */
fun stringManipulation(input:String):String{
    var result:String = ""
    var upper = input.uppercase()
    var lower = input.lowercase()
    
    if(input == upper){
        println("$input is already in uppercase")
    } else {
        result = input.uppercase()
    	println("$input in uppercase is $result")
    }
    if(input == lower){
        println("$input is already in lowercase")
    } else {
        result = input.lowercase()
    	println("$input in lowercase is $result")
    }
    
    return result
    }
fun main() {
    stringManipulation("Woow")
}
