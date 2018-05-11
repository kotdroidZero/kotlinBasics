package kotlin_collections

/**
 *here we are going to define few important function of Collection apis
 */

fun main(args: Array<String>) {
    val myNumbers:List<Int> = listOf(4,1,2,3,4,5,20,41,36,98,14,15,16,18,40,49)

    val smallerNumberList=myNumbers.filter { it<10 }
    println("After applying the filter the numbers less than 10 are :")
    smallerNumberList.forEach(::println)

    val squaredNumberList=myNumbers.filter { it<10 }.map { it*it }
    println("After applying the filter the square of numbers  less than 10 are :")
    squaredNumberList.forEach(::println)

    val persons= listOf(Person(10, "Sohail"), Person(12, "Swapnil"),
            Person(14, "Rahul"), Person(12, "Love"), Person(1, "Apoorv")
            , Person(18, "Ankita"), Person(8, "Swarit"), Person(10, "Sean Paul"),
            Person(25, "DJ Snake"), Person(30, "Avicci"),
            Person(28, "Charlie Puth"))

    val allNames=persons.map { it.name }
    println("\nAll Names are:")
    allNames.forEach(::println)

    val namesWithS=persons.filter { it.name.startsWith("S") }.map { it.name }
    println("\nNames starting with S:")
    namesWithS.forEach(::println)

    val kids=persons.filter { it.age<15 }.map { it.name }
    println("\nKids are :")
    kids.forEach(::println)

    val teens=persons.filter { it.age in 15..19 }.map { it.name }
    println("\nTeenagers are :")
    teens.forEach(::println)

    val adults=persons.filter { it.age>19 }.map { it.name}
    println("\nAdults are :")
    adults.forEach(::println)

}

class Person(var age:Int,var name:String){

}