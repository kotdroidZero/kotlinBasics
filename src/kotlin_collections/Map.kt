package kotlin_collections

fun main(args: Array<String>) {
    /**
     Immutable Map
     */

    //using mapOf
    var immutableMap= mapOf<Int,String>(1 to "Pushkar",2 to "Rahul",3 to "Shray")
    immutableMap.forEach(::println)

   /**
    Mutable Map
    */

    //1. using HashMap
    var mutableMap1=HashMap<Int,Int>()
    mutableMap1.put(1,65)
    mutableMap1.put(6,165)
    mutableMap1.put(3,625)
    println("\n mutable map using HashMap")
    mutableMap1.forEach(::println)

    //2.using hashMapOf
    var mutableMap2= hashMapOf<Int,String>()
    mutableMap2.put(1,"Lucknow")
    mutableMap2.put(2,"Chandigarh")
    mutableMap2.put(3,"Faizabaad")
    mutableMap2.put(4,"Jammu")
    println("\n mutable map using HashMap")
    mutableMap2.forEach(::println)

    //3.using mutableMap
    var mutableMap3= mutableMapOf<Int,Int>()
    mutableMap3.put(19,65)
    mutableMap3.put(61,165)
    mutableMap3.put(33,625)
    println("\n mutable map using mutableMap")
    mutableMap3.forEach(::println)





}
