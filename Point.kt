import kotlin.math.sqrt
import kotlin.math.pow

class Point(var x : Int, var y : Int){
    override fun toString(): String {
        return "x=${x}, y=${y}"
    }

    operator fun plus(other : Point) : Point{
        return Point(this.x + other.x, this.y + other.y)
    }

    operator fun minus(other : Point) : Point{
        return Point(this.x - other.x, this.y - other.y)
    }

    fun distanceTo(other : Point) : Int{
        return sqrt(((this.x).toFloat() - other.x).pow(2) + ((this.y).toFloat() - other.y).pow(2)).toInt()
    }


}