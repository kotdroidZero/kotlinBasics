package kotlin_collections

/**
note.
 Set and Hash Set both contains unique values , the only difference between them is
 Set keeps the value in the sequence in which they have been entered and HashSet doesn't maintain
 that sequence.
 */
fun main(args: Array<String>) {
    /**
     ImmutableSet
     */

    //using setOf
    var immutableSet= setOf(4,5,6,9,9,9,7,8)
    immutableSet.forEach(::println)

    /**
     MutableSet
     */

    //1.using mutableSetOf()
    var mutableSet1= mutableSetOf<Int>()
    mutableSet1.add(78)
    mutableSet1.add(78)
    mutableSet1.add(78)
    mutableSet1.add(79)
    println("\n mutable set created by using mutableSetOf()")
    mutableSet1.forEach(::println)


    //1.using hashSetOf
    var mutableSet2= hashSetOf<Int>()
    mutableSet2.add(78)
    mutableSet2.add(77)
    mutableSet2.add(78)
    mutableSet2.add(78)
    mutableSet2.add(78)
    mutableSet2.add(78)
    mutableSet2.add(75)
    println("\n mutable set created by using hashSetOf()")
    mutableSet2.forEach(::println)



}
