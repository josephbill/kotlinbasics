// functions are reusable blocks of code that perform a specific task
// simple function / named function
fun greet(){
    println("Hello from the named function")
}
// function with parameters
fun greet_with_params(name: String){
    name.uppercase()
    println("hello from the params function : $name")
}
// function with a 'return' value
fun add(a: Int, b: Int): Int {
    return a + b
}
// function with default arguments
fun subtract(a: Int = 10, b: Int = 10): Int {
    return b - a
}

fun main(){
    greet() //invoking a function
    greet_with_params("Joseph") // invoking a function with params
    greet_with_params("Alice")
    val sum = add(5,3)
    println(sum)
    val diff = subtract(20,40)
    println(diff)
}







