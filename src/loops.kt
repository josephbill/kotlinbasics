// A loop allow repeat tasks a number of set times or over a
// collection of data
// In kotlin for loop(used when we have no of iterations)
// , while loop(continues as long as condition is true)
// and foreach loop(used to loop over collection e.g. arrays)
fun main(){
    // for loop
    // iterate over a range
    for(i in 1..5){
        println(i)
    }
    // adding a step
    for(i in 1..10 step 2){
        println(i)
    }
    // iterate down
    for(i in 5 downTo 1){
        println(i)
    }
    // iterate over a collection
    val fruits = listOf("Apple","Banana","Cherry")
    for(i in fruits){
        converttoUpper(i)
        println(i)
    }
    // print with index position
    for((index,fruit) in fruits.withIndex()){
        println("$index :: $fruit")
    }

    // while loop
    var i = 1
    //basic while loop
    while (i <= 5){
        println(i)
        i++
    }
    // do while loop :: do executes without conditions
    // then utilizes the while block to look at the condtion
    var j = 10
    do {
        println(j)
        j++
    } while (j <= 5)
    // NESTED LOOP : a loop inside a loop
    // for every iteration of the outer loop , the inner loop must
    // complete its set of iteration
    for(i in 1..3){ // outer loop
        println("$i : outer loop")
        for(j in 1..3){ //inner loop
            println("$j : inner loop")
        }
    }
// Loop CONTROL STATEMENTS : break , continue ,
// labels(outer and inner)
   // break : it terminates the loop when a condition is met
    for(i in 1..10){
        if (i == 5){
            break
        }
        println(i)
    }
    // continue : if the condition is met it skips the iteration
    for(i in 1..10){
        if (i == 5){
            continue
        }
        println(i)
    }
    // label statements outer and inner
    outer@ for(i in 1..3){
        inner@ for (j in 1..3){
            if(i == 2 && j == 2){
               break@outer
            }
            println("i=$i, j=$j")
        }
    }

    // foreach : iterate / loop over collections
    //we use the keyword it to reference in the collection
    val numbers = listOf(1,2,3,4,5)
    val names = listOf("Joseph", "Alice", "Doe")
    numbers.forEach {
        println("$it")
    }
    names.forEach {
        converttoUpper(it)
    }
}

fun converttoUpper(i: String) {
    println(i.uppercase())
}













