fun main(args: Array<String>) {

    /**
     * In Kotlin everything is non-null by default but if you need nullable variables,
     * you must explicitly set that variable as nullable for doing so you need to put a "?" along-with
     * data type of your variables
    */

    var person:Person?=Person()
    person=null

    /**
     * now when you have made something nullable then while accessing that variables or field
     * or property you need to check if it is null or not
     * */

    //way1. if you want to crash your application or you are sure about that the object is not null
    //  at this point then simply add "!!" with object or variable

   // person!!.name

    //way2. if you want to proceed safely then add "?" with object or variables and it will only proceed
    //when it is non-null
    person?.name
    println(person?.name?:"no name")
}

class Person{
    var name:String?=null
}