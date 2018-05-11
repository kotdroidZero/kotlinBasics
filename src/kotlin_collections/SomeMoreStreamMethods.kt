package kotlin_collections

fun main(args: Array<String>) {
    val numList=1..5

    val reducedSum=numList.reduce{x,y->x*y}
    println(reducedSum)

    val foldedSum=numList.fold(2){x,y->x*y}
    println(foldedSum)
}