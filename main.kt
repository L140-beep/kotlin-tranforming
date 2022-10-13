fun main(){

    val triangle = Triangle(Point(1, 2),3F, 4F, 5F)
    println(triangle.getCenter())
    triangle.rotate(RotateDirection.CounterClockwise, Point(3, -3))
    triangle.printSides()
    println(triangle.getCenter())
    triangle.rotate(RotateDirection.Clockwise, Point(3, -3))
    println(triangle.getCenter())
    triangle.resize(2)
    println(triangle.getArea())

    println()

    val square = Rectangle(Point(4, 3),2F, 4F)
    println(square.getCenter())
    square.rotate(RotateDirection.CounterClockwise, Point(3, -3))
    square.printSides()
    println(square.getCenter())
    square.rotate(RotateDirection.Clockwise, Point(3, -3))
    println(square.getCenter())
    square.resize(2)
    println(square.getArea())

    println()

    val circle = Circle(Point(1, 5),3F)
    println(circle.getCenter())
    circle.rotate(RotateDirection.CounterClockwise, Point(3, -3))
    circle.printSides()
    println(circle.getCenter())
    circle.rotate(RotateDirection.Clockwise, Point(3, -3))
    println(circle.getCenter())
    circle.resize(2)
    println(circle.getArea())
}