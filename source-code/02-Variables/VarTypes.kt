fun main(args: Array<String>) {
   val someValue = 4
   val someValue2 = 4.56
   val someValue3 = 'c'

   println(someValue.javaClass.kotlin.qualifiedName)
   println(someValue2.javaClass.kotlin.qualifiedName)
   println(someValue3.javaClass.kotlin.qualifiedName)
}
