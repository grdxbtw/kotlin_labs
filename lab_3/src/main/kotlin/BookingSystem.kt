import java.util.*

class BookingSystem {
    private val accommodations = mutableListOf<Accommodation>()

    fun addAccommodation(accommodation: Accommodation) {
        accommodations.add(accommodation)
    }

    fun bookAccommodation(name: String, guestName: String, date: Date): Boolean {
        val accommodation = accommodations.find { it.name == name }
        return if (accommodation != null) {
            accommodation.book(guestName, date)
        } else {
            println("Accommodation $name not found.")
            false
        }
    }

    fun displayAccommodations() {
        println("Accommodation List:")
        for (accommodation in accommodations) {
            val status = if ((accommodation as AccommodationBase).isBooked) "Booked" else "Available"
            println("${accommodation.name} - $status")
        }
    }
}