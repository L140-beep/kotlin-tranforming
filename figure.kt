interface FigureInterface {
    val figureName : String
    var figureCenter : Point
    fun printSidesCount()
    fun printSides()
    fun getCenter() : Point
}

abstract class Figure : FigureInterface, Movable, Transforming{
    protected lateinit var sides : FloatArray
    abstract fun getArea() : Float

    override fun rotate(direction: RotateDirection, new_center: Point) {
        var center = getCenter()
        var delta_y = center.y - new_center.y
        var delta_x = center.x - new_center.x

        when (direction) {
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

    override fun resize(zoom: Int) {
        for (side in 0..sides.size - 1){
            sides[side] = sides[side] * zoom
        }
    }

    override fun printSidesCount(){
        println("Counts sides of ${this.figureName}: ${sides.size}")
    }

    override fun move(new_center: Point) {
        figureCenter = new_center
    }

    override fun printSides() {
        println("Sides of ${this.figureName}: ${sides.contentToString()}")
    }

    override fun getCenter() : Point {
        return this.figureCenter
    }
}