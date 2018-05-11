fun main(args: Array<String>) {
//    var myClass=MyClass()
//    myClass.count=12
//    println("${myClass.count} : ${myClass.typeOfCustomer()}")

    MyClass.count=89

    println("${MyClass.count} : ${MyClass.typeOfCustomer()}")
}

//class MyClass{
//
//    var count=-1
//
//    fun typeOfCustomer():String{
//        return "Regular"
//    }
//}




/**
 * here fields and functions are behaving as static member of the class MyClass and this becomes
 * SINGLETON class whose only one instance is available in whole runtime of the application that
 * too is managed by KOTLIN itself
 * */
//object MyClass{
//        var count=-1
//
//        fun typeOfCustomer():String{
//            return "Regular"
//        }
//
//}

/**
 * here fields and functions are actually static inside the companion object{}
 * */
class MyClass{

    companion object {
        var count=-1

        fun typeOfCustomer():String{
            return "Regular"
        }
    }

}