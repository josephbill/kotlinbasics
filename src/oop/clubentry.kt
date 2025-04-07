package oop
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
                override val vipBenefits: String)
    : ClubRules{

    override fun canEnter(member: Member): Boolean {
        TODO("Not yet implemented")
    }

}






