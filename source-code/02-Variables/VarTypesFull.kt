fun main(args: Array<String>) {
   val someValue = 4
   val someValue2 = 4L
   val someValue3 = 4.56
   val someValue4 = 4.56F
   val someValue5 = 'c'

   println(someValue.javaClass.kotlin.qualifiedName)
   println(someValue2.javaClass.kotlin.qualifiedName)
   println(someValue3.javaClass.kotlin.qualifiedName)
   println(someValue4.javaClass.kotlin.qualifiedName)
   println(someValue5.javaClass.kotlin.qualifiedName)
}
