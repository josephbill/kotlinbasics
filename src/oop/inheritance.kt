package oop

// ability of one class (sub-class) to inherit methods /
// properties from another class (parent-class)

// parent class // use the open keyword to make class inheritable
// the final keyword is default and all classes are blocked from
// inheritance unless open is used in class defination
open class Animal(val name: String) {
    open fun makeSound(){
        println("Some generic animal sound")
    }
    fun printName(){
        println("The animal name is $name")
    }
}
// sub class
class Dog(name: String) : Animal(name){
     // this dog blueprint can have its own properties and methods
    // and can also override existing methods
     override fun makeSound(){
         println("Barks!")
     }
}
fun main(){
   val dog = Dog("Rex")
   val dog2 = Dog("Rex2")
    dog.makeSound()
    dog.printName()
}



















