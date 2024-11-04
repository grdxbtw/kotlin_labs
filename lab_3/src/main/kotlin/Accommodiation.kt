import java.util.*


interface Accommodation {
    val name: String
    fun book(guestName: String, date: Date): Boolean
}