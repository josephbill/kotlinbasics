package oop
import name
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// define some constant values
enum class MembershipTypes{
    REGULAR,
    VIP,
    GUEST;
    // companion object : this references variables/fun that belong
    // to the class and not instances of the class
    companion object{
        fun fromInput(input: String) : MembershipTypes? {
            return when(input.uppercase()){
                "R" -> REGULAR
                "V" -> VIP
                "G" -> GUEST
                else -> null
            }
        }
    }
}
// data class
data class Member(
    val id: String,
    val name: String,
    val age: Int,
    val membership: MembershipTypes,
    val entryTime : LocalDateTime = LocalDateTime.now()
)

// club rules interface
interface ClubRules{
    val minimumAge: Int
    val vipBenefits : String
    fun canEnter(member: Member) : Boolean
}
// Main class
class NightClub(override val minimumAge: Int,
                override val vipBenefits: String, val name: String)
    : ClubRules{
        // hold a list of members  [ {} , {} ,{} ....]
        private val currentMembers = mutableListOf<Member>()
        // hold a set of banned members { '1' . '2' ,'3'}
        private val bannedMembers = mutableSetOf<String>()
        // companion object to hold the current time if needed
     companion object {
         val timeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern(
             "HH:mm:ss"
         )
     }
    override fun canEnter(member: Member): Boolean {
        return member.age >= minimumAge && !bannedMembers.contains(
            member.id
        )
    }

    // this function allows addition of members
    fun addMember(member: Member){
        //validating if my member can access my club
        if(canEnter(member)){
            //add our member to our list of members
            currentMembers.add(member)
            println("${member.name} (${member.membership}) entered at " +
                    "${member.entryTime.format(timeFormatter)} ")
            // check on the benefits if member is VIP, REGULAR , GUEST
            when(member.membership) {
                MembershipTypes.VIP->println("\tVIP BENEFITS: $vipBenefits")
                MembershipTypes.GUEST->println("\tGuest pass expires 12:00PM")
                else -> {}
            }
        } else {
            println("${member.name} cannot enter. " +
                    "${if(member.age < minimumAge){
                         "Too young"
                    } else {
                        "Banned"
                    }
            }")
        }
    }

    // this function will allow my objects to be entered in the banned
    // section listing
    fun banMember(id: String){
        // adding id to my banned members list
        bannedMembers.add(id)
        // removing the member from the current members listing
        currentMembers.removeIf{it.id == id}
        println("\nMember $id has been banned")
    }

    // function to list current pool of members
    fun listCurrentMembers(){
        if(currentMembers.isEmpty()){
            println("\nNo members currently added")
            return
        }
        println("\nCurrent Members in club:")
        currentMembers.forEach{
            println("- ${it.name} (${it.membership}) since ${it.entryTime
                .format(timeFormatter)}")
        }
    }

}

// MY TERMINAL APP
// input helper functions
fun readString(prompt: String) : String {
    print(prompt)
    return readlnOrNull()?.trim() ?: ""
}
fun readInt(prompt:String) : Int {
    while(true){
        try{
            print(prompt)
            return readlnOrNull()?.toInt() ?: throw NumberFormatException()
        }catch (e: NumberFormatException){
            println("please enter a valid number")
        }
    }
}
// display our menu
fun showMenu(){
    println("\n==== CLUB MANAGEMENT SYSTEM ====")
    println("1. Add New Member")
    println("2. Ban Member")
    println("3. List Current Members")
    println("4. Exit")
    print("Enter Your choice: ")
}
fun main(){
     //create club
    val club = NightClub(
        minimumAge = 18,
        vipBenefits = "Free drinks and lounge access",
        name="XOXO"
    )
    println("WELCOME TO THE CLUB MANAGEMENT SYSTEM")
    while(true){
        showMenu()
        when(readlnOrNull()?.trim()){
           "1" -> {
               println("\nAdd new member")
               val id = readString("Enter Member Id: ")
               val name = readString("Enter Member name: ")
               val age = readInt("Enter Member age: ")
               var membership: MembershipTypes? = null
               while(membership == null){
                   print("Enter membership type (R:Regular, V:VIP, G:Guest)")
                   membership = MembershipTypes.fromInput(
                       readlnOrNull()?.trim() ?: ""
                   )
                   if(membership == null){
                       println("Invalid membership type")
                   }
               }
               club.addMember(Member(id, name, age, membership))
           }
            "2" -> {
                println("\nBan Member")
                val id = readString("Enter Member ID to ban")
                club.banMember(id)
            }
            "3" -> {
                club.listCurrentMembers()
            }
            "4" -> {
                println("Exiting program")
                return
            }
            else -> {
                println("Invalid choice selected.")
            }
        }
    }
}




























