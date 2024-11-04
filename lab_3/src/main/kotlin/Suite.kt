class Suite(name: String, val hasLounge: Boolean) : AccommodationBase(name) {
    init {
        println("Suite $name with lounge: $hasLounge created.")
    }
}