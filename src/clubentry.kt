fun main(){
    println("Welcome to the club entry system")
    print("Enter your age: ")
    val age = readln().toIntOrNull() ?: 0
    print("Do you have a VIP pass(yes/no) ")
    val hasVipPass = readln().equals("yes" , ignoreCase = true)
    print("Are you a member? (yes/no): ")
    val isMember = readln().equals("yes" , ignoreCase = true)
    println(age)
    println(hasVipPass)
    println(isMember)
}