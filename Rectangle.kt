class Rectangle(center : Point, a: Float, b : Float = -1F) : Figure() {
    init {
        sides = FloatArray(2)
        sides[0] = a
        sides[1] = if (b <= 0) a else b
    }

    override fun rotate(direction: RotateDirection, new_center: Point) {
        var side = sides[0]
        sides[0] = sides[1]
        sides[1] = side

        var center = getCenter()
        var delta_y = center.y - new_center.y
        var delta_x = center.x - new_center.x

        when(direction){
            RotateDirection.Clockwise -> {
                var new_x = new_center.x + delta_y
                var new_y = new_center.y - delta_x

                figureCenter = Point(new_x, new_y)
            }
            RotateDirection.CounterClockwise -> {
                var new_x = new_center.x - delta_y
                var new_y = new_center.y + delta_x

                figureCenter = Point(new_x, new_y)
            }

        }
    }

    override var figureCenter = center

    override fun getArea() : Float {
        return sides[0] * sides[1]
    }

    override val figureName: String
        get() = if(sides[0] == sides[1]) "Square" else "Rectangle"
}