# Kotlin-tranforming

```kotlin
fun main(){
    
    
    val triangle = Triangle(Point(1, 2),3F, 4F, 5F)
    
    println(triangle.getCenter()) //x=1, y=2
    triangle.rotate(RotateDirection.CounterClockwise, Point(3, -3))
    triangle.printSides() //Sides of Triangle: [3.0, 4.0, 5.0]
    println(triangle.getCenter()) // //x=-2, y=-5
    triangle.rotate(RotateDirection.Clockwise, Point(3, -3))
    println(triangle.getCenter()) //x=1, y=2
    triangle.resize(2)
    println(triangle.getArea()) //24.0

    println()
    
    val square = Rectangle(Point(4, 3),2F, 4F)
    println(square.getCenter()) //x=4, y=3
    square.rotate(RotateDirection.CounterClockwise, Point(3, -3))
    square.printSides() // Sides of Rectangle: [4.0, 2.0]
    println(square.getCenter()) // x=-3, y=-2
    square.rotate(RotateDirection.Clockwise, Point(3, -3)) // x=4, y=3
    println(square.getCenter())
    square.resize(2)
    println(square.getArea()) // 32.0

    println()
    
    val circle = Circle(Point(1, 5),3F)
    println(circle.getCenter()) // x=1, y=5
    circle.rotate(RotateDirection.CounterClockwise, Point(3, -3))
    circle.printSides() // null
    println(circle.getCenter()) // x=-5, y=-5
    circle.rotate(RotateDirection.Clockwise, Point(3, -3))
    println(circle.getCenter()) // x=1, y=5
    circle.resize(2)
    println(circle.getArea()) // 113.097336
}
```
