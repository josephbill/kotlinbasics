package oop

import java.sql.Date

class Person {
    // properties
    var name: String = ""
    var age: Int = 0
    // methods
    fun speak(){
        println("Hello , my name is $name, I;m $age")
    }
}

// Kotlin provides a more concise way of declaring
// classes : classes declared using a constructor
class Vehicle(val model: String , val make: String,
    val yom: Int){
    fun identifyCar(){
        println("The car is $make $model and was manufactured " +
                "$yom" )
    }
}
// create an object from above class
fun main(){
    var person1 = Person()
    val person2 = Person()
    person1.name = "Joseph"
    person1.age = 28
    person1.speak()

    val vehicle1 = Vehicle("Corolla","Toyota"
    ,2006)
    val vehicle2  = Vehicle("X", "Toyota"
        , 2002)
    vehicle1.identifyCar()
    vehicle2.identifyCar()
}