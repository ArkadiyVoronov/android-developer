package geometry

import geometry.circle.circumference

/**
 * Main method, displaying the circumference of two circles
 */
fun main(args: Array<String>) {
   printCircumference(3.78)
   printAngleDeg(geometry.constants.PI)
   printEquilateralTrianglePerimeter(3.0)
   printSquarePerimeter(3.0)
}

/**
 * Prints the circumference of a circle when the diameter is [diameter]
 * @param diameter the circumference of the circle
 */
fun printCircumference(diameter: Double){
   println("circumference("+diameter+")="+circumference(diameter))
}

/**
 * Prints the conversion of an angle measured in radian to
 */
fun printAngleDeg(angRad: Double) {
   println("toDegrees(" + angRad + ")=" + geometry.angles.toDegrees(angRad))
}

/**
 * Prints the perimeter of an equilateral triangle when the length of a side is [sideLength]
 * @param sideLength the length of a side of the equilateral triangle
 */
fun printEquilateralTrianglePerimeter(sideLength: Double){
   println("Equilateral triangle perimeter(" + sideLength + ")=" + geometry.triangle.equilateral.perimeter(sideLength))
}

/**
 * Prints the perimeter of a square when the length of a side is [sideLength]
 * @param sideLength the length of a side of the square
 */
fun printSquarePerimeter(sideLength: Double){
   println("Square perimeter(" + sideLength + ")=" + geometry.quadrilateral.square.perimeter(sideLength))
}
