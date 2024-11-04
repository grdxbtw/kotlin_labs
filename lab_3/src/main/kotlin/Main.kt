import java.util.Date

fun main() {
    val bookingSystem = BookingSystem()

    val room1 = Room("Room 1")
    val suite1 = Suite("Suite 1", hasLounge = true)
    val apartment1 = Apartment("Apartment 1", bedrooms = 3)

    bookingSystem.addAccommodation(room1)
    bookingSystem.addAccommodation(suite1)
    bookingSystem.addAccommodation(apartment1)

    bookingSystem.displayAccommodations()

    val bookingDate = Date()
    bookingSystem.bookAccommodation("Room 1", "guest 1", bookingDate)
    bookingSystem.bookAccommodation("Suite 1", "guest 2", bookingDate)

    bookingSystem.bookAccommodation("Room 1", "guest 3", bookingDate)

    bookingSystem.displayAccommodations()
}
