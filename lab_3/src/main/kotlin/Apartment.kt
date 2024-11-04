class Apartment(name: String, val bedrooms: Int) : AccommodationBase(name) {
    init {
        println("Apartment $name with $bedrooms bedrooms created.")
    }
}