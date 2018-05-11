fun main(args: Array<String>) {
    var result:Int=-1

    doMaths(45,987){x,y->result=x+y}

    println("The result is :$result")

    doReverse("pushkaR"){s->s.reversed()}

    //or

    doReverse("pandeY"){it.reversed()}
}

fun doMaths(a:Int,b:Int,actionToPerform:(Int,Int)->Unit):Unit{
    actionToPerform(a,b)
}

fun doReverse(str:String,reverseAction:(String)-> String):Unit{
    var result=reverseAction(str)
    println("$str after reversing became :$result")
}