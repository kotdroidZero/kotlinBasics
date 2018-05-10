

fun main(args: Array<String>) {
    val oneTo10 =1..10

    val tenTo1= 10.downTo(1)

    val twoTo20=2.rangeTo(20)

    val range=oneTo10.step(2)

//    for (x in range) println("range :$x")
//
//    for (x in tenTo1.reversed()) println("reversed :$x")
//
//    for (x in twoTo20) println("twoTo20 :$x")

    val age=8

    if (age<5) println("Go to PreSchool")
    else if (age==5) println("Go to KinderGarden")
    else if ((age>5)&&(age<=17)){
        val grade=age-5
        println("Go to Grade $grade")
    }
    else println("Go to College")

    when(age){
        1,2,3,4 -> println("Go to PreSchool")
        5 -> println("Go to KinderGarden")
        in 6..17 -> {
            var grade=age-5
            println("Go to Grade $grade")
        }
        else -> println("Go to College")
    }

    val array1:Array<Int> = arrayOf(3,6,9)
    for ((index,value) in array1.withIndex()) println("index :$index value :$value")

    val  (two ,three)=nextTwo(1)

    println("1 ,$two ,$three")

    println("Sum of 1,2,3,4,5,9,7 is : ${getSum(1,2,3,4,5,9,7)}")

}

fun nextTwo(num:Int):Pair<Int,Int>{
    return Pair(num+1,num+2)
}

fun getSum(vararg nums:Int):Int{
    var sum=0;

    nums.forEach { n->sum+=n }

    return sum
}