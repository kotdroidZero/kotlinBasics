package kotlin_collections

/**
  here m using the Predicate Function Interface as Lambda expression
 */
fun main(args: Array<String>) {
    val numList= listOf(4,5,6,3,2,1,3,4,6,4,5,21,6,4)
    if (numList.all { it>10 })
        println("All numbers in List are larger than 10")
    else
        println("Not all numbers in List are larger than 10")

    if (numList.any { it>10 }) {
        println("${numList.count() { it>10 }} numbers in List are larger than 10")
        println("And that number is ${numList.find { it>10 }}")}
    else
        println("No numbers in List are larger than 10")
}