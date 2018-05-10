fun main(args: Array<String>) {

    doSum(45,65,myLambdaa)

    doSum(4,5,object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })
}
var myLambdaa:(Int) -> Unit = {s:Int-> println(s)}

//var myLambdaMultiply:(num1:Int) -> Int = {num2:Int-> num2*num1}

fun doMaths(num1: Int):(num1:Int) -> Int = {num2:Int-> num2*num1}


fun doSum(num1:Int,num2: Int,action: (Int) -> Unit):Unit{             //using High Level Function with lambda as parameter
    var sum=num1+num2
    action(sum)
}

fun doSum(num1:Int,num2: Int,action:MyInterface):Unit{            //using interface ObjectOriented Way way
    var sum=num1+num2
    action.execute(sum)
}
interface MyInterface{
    fun  execute(sum:Int):Unit
}