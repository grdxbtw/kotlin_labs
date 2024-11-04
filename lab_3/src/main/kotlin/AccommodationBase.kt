import java.util.*

abstract class AccommodationBase(
    override val name: String
) : Accommodation {
    var isBooked: Boolean = false
    var bookedDate: Date? = null
    var guestName: String? = null

    override fun book(guestName: String, date: Date): Boolean {
        return if (!isBooked) {
            this.isBooked = true
            this.bookedDate = date
            this.guestName = guestName
            println("Booking successful for $guestName in $name on $date.")
            true
        } else {
            println("$name is already booked.")
            false
        }
    }
}