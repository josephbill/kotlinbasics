// scoping simply references where we can access variables and
// functions
// global scope : this is simply a variable defined outside a function
// at the top part of the script
var full_name = "Joseph"
fun convertlower(){
    // local scope : variables defined within a function
    // and only accessible in the function
    val outer = "This is a variable defined inside a function"
    if(true){
        // block level scope
        //inner here belongs to the if statement and not the function
        val inner = "This is inside the if statement"
        println(outer)
        println(inner)
    }
    full_name.lowercase()
    println(outer)
}
fun main(){
    println(full_name)
    convertlower()
}






