fun main(){
    val triangle = Triangle(Point(1, 2),3F, 4F, 5F)
    triangle.printSides()
    triangle.printSidesCount()
    println(triangle.getCenter())

    val square = Rectangle(Point(4, 3),2F, 4F)
    println(square.getCenter())

    square.rotate(RotateDirection.CounterClockwise, Point(3, -3))
    square.printSides()
    println(square.getCenter())


    val circle = Circle(Point(1, 5),3F)
    println(circle.getCenter())
    circle.printSides()
    circle.printSidesCount()
}