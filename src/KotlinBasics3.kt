
fun main(args: Array<String>) {

    var myMath=doMath(3)

    println(myMath(5))

}

fun doMath(num1:Int):(Int)->Int={num2->num1+num2}
