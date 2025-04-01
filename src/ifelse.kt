// Kotlin has following conditionls
// 1. Use of if to specify that a block o code is to be executed if a condition is true
// 2. Use of else to specify if above condition is false
// 3. else if to add new conditions to our test
// 4. when to specify many alternative to be executed
var a = 40
var b = 40
fun main(){
    if(a > b){
          println("$a is greater than $b")
    } else if(a < b){
        println("$a is less than $b")
    } else if(a == b){
        println("$a is equal to $b")
    }
    else {
        println("$a is not greater than $b")
    }
}













