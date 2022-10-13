class Circle(center : Point, var r : Float) : Figure(){

    override fun resize(zoom: Int) {
        r *= zoom
    }

    override fun getArea(): Float {
        return Math.PI.toFloat() * r * r
    }

    override var figureCenter = center

    override fun printSidesCount() {
        println(0)
    }

    override fun printSides() {
        println(null)
    }

    override val figureName: String
        get() = "Circle"
}