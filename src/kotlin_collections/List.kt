package kotlin_collections

fun main(args: Array<String>) {

    /**
     Immutable List
     */
    //listOf keyword or method only creates immutable list
    var immutableList= listOf<String>("Pushkar","Rahul","Suraj")  //immutable , has fixed size,READ_ONLY
    immutableList.forEach(::println)

    println()
    for (index in 0..immutableList.size-1){
        println(immutableList[index])

        //or

        println(immutableList.get(index))
    }

    /**
     Mutable list
      */
    //1.using ArrayList

    var mutableList1=ArrayList<String>()

    mutableList1.add("Love")
    mutableList1.add("Anil")
    mutableList1.add("Rohit")
    println("\nMutable List using ArrayList<>()")
    mutableList1.set(2,"Supriya")
    mutableList1.forEach(::println)


    //2.using arrayListOf
    var mutableList2= arrayListOf<Int>()

    mutableList2.add(78)
    mutableList2.add(98)
    mutableList2.add(83)
    println("\nMutable List using arrayListOf")
    mutableList2.forEach(::println)

    //3.using mutableListOf
    var mutableList3= mutableListOf<Int>()

    mutableList3.add(781)
    mutableList3.add(198)
    mutableList3.add(813)
    println("\nMutable List using mutableListOf")
    mutableList3.forEach(::println)









}