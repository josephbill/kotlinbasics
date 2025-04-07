package oop
// interfaces are contracts between classes
// use the keyword interface to create one
// an interface will define functions which must be
// implemented on any class that extends the interface
interface Measurements{
    fun area() : Double
    fun perimeter() : Double
}
class Circle(val radius: Double) : Measurements{
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter() : Double {
        return 2 * Math.PI * radius
    }
}
fun main(){
    val circle1 = Circle(10.0)
    println(circle1.area())
    println(circle1.perimeter())
}
// GET AREA AND PERIMETER POF A SQUARE USING THE INTERFACE










