/** The value of π for calculating the circumference */
const val PI: Double = 3.14

/**
 * Main method, displaying the circumference of two circles
 */
fun main(args: Array<String>) {
   printCircumference(3.78)
   printCircumference(1.72)
}

/**
 * Prints the circumference of a circle when the diameter is [diameter]
 * @param diameter the circumference of the circle
 */
fun printCircumference(diameter: Double){
   println("circumference("+diameter+")="+circumference(diameter))
}

/**
 * Returns the circumference of circle when diameter is [diameter]
 * @param diameter the diameter of circle
 * @return the circumference of a circle when diameter is [diameter]
 */
fun circumference(diameter: Double): Double{
   return PI*diameter
}
