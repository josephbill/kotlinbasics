// arrays are used to store multiple values in a single variable
// create an array using arrayOf() . listOf()
val car_s = arrayOf("Volvo","BMW","Mazda",0, arrayOf("Toyota Corolla",
    "Toyota X"))
// accessing elements inside of an array
// we access an element by referring to the index number inside []'s
// index position starts from 0
fun main(){
    println(car_s[1]) // access element in array
    // changing an element inside an array
    // simply access element and reassign its value
    car_s[3] = "Toyota Corolla"
    car_s[4] = "Toyota X"
    println(car_s)
    // to know the number of elements in an array use the .size method
    println(car_s.size) // 5
    // checking if an element exists in an array
    // use the 'in' operator
    if("Jeep" in car_s){
        println("It exists")
    } else {
        println("It does not exists")
    }
    // looping/trasversing an array ,forEach , for loop
    for(x in car_s){
        println(x)
    }

}




