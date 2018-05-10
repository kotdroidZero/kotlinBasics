
@file:JvmName("KotlinBasics")
fun main(args: Array<String>) {
    println("hello world")
    println("BiggestInt is : ${Int.MAX_VALUE}")
    println("SmallestInt is : ${Int.MIN_VALUE}")
    println("BiggestLong is : ${Long.MAX_VALUE}")
    println("SmallestLong is : ${Long.MIN_VALUE}")

    var array= arrayOf("Pushkar",1,2.5F,'A')

    var copyArray=array.copyOfRange(1,4)

    println("Index Of A ${array.indexOf('A')}")
    println(""+copyArray[0] +" "+copyArray[1]+" "+copyArray[2])
    println("Array contains Pushkar :${array.contains("Pushkar")}")
    println("first in array :${array.first()}")
    println("last in array :${array.last()}")
    println("first in copyArray :${copyArray.first()}")
    println("last in copyArray :${copyArray.last()}")

    println("largest in 7 and 57 is :${getlargest(b=57,a = 7)}")

    //extension function
    var word="Welcome ".add(s2="Kotlin World",s1="to the ")
    println(word)
}

fun String.add(s1:String,s2:String):String=this+s1+s2

fun getlargest(a:Int=8,b:Int):Int=if (a>b) a else b