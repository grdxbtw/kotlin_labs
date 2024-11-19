package org.example

fun main() {
    val car1 = Car("Ferrari", 2020, 5)
    val car2 = Car("Mercedes", null, 4)
    val car3 = Car("BMW", 2018, null)

    println("Car 1 : ${car1.isCarSuitableForUse()}")
    println("Car 2 : ${car2.isCarSuitableForUse()}")
    println("Car 3: ${car3.isCarSuitableForUse()}")
}