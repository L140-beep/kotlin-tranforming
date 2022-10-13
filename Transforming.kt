interface Transforming {
    fun resize(zoom : Int)
    fun rotate(direction : RotateDirection, new_center: Point)
}