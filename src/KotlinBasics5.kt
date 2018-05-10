fun main(args: Array<String>) {

    addTwoNum(34,56,myLambdaFunc)               //passing lambda expression in high level function
    /**
     * wer can also use direct lambda expression here without passing its variable name to it. like this
     * */

    addTwoNum(65,78,{ x , y -> x + y})

    //or

    addTwoNum(65,45){x,y->x+y}

}

val myLambdaFunc:(Int,Int)->Int={x,y->x+y}          //lambda expression function


fun addTwoNum(a:Int,b:Int,myFunc:(Int,Int)->Int):Unit{    //HIgh level function with lambda expression as parameter
    var result=myFunc(a,b)
    println("SUm of $a and $b is :$result")
}