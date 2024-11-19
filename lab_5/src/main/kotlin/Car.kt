package org.example

class Car(
    val model: String,
    val year: Int?,
    val passengerCount: Int?
) {

    fun isCarSuitableForUse(): Boolean {
        return year != null && passengerCount != null
    }
}