fun main(args: Array<String>) {
   var diameter: Double = 3.78
   var circumference = circumference(diameter)
   println(circumference)
   diameter = 1.72
   circumference = circumference(diameter)
   println(circumference)
}

fun circumference(diameter: Double): Double{
   return 3.14*diameter
}
