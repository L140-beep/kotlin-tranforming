import kotlin.math.sqrt

class Triangle(center : Point, a: Float, b: Float, c: Float) : Figure(){
    init{
        sides = FloatArray(3)
        sides[0] = a
        sides[1] = b
        sides[2] = c
    }

    override var figureCenter = center

    override fun getArea(): Float {
        var p = (sides[0] + sides[1] + sides[2]) / 2
        return sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]))
    }

    override val figureName: String
        get() = "Triangle"
}