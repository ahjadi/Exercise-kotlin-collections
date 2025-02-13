fun main() {
    // Part 1
    val myFavoriteFruits = mutableListOf("Orange", "Blueberry", "Strawberry")
    myFavoriteFruits.add("Mango")
    myFavoriteFruits.removeAt(1) // Remove the second fruit from the list.
    println(myFavoriteFruits)
    // Part 2
    val mutableSetOfNumbers = mutableSetOf(1, 2, 3, 4, 5, 5)
    mutableSetOfNumbers.add(3)
    mutableSetOfNumbers.add(6)
    println(mutableSetOfNumbers)
    // Part 3
    val countryCapitalMap = mutableMapOf(
        "USA" to "Washington",
        "France" to "Paris",
        "Germany" to "Berlin"
    )
    countryCapitalMap.put("UK", "London")
   // or countryCapitalMap["UK"] = "London"
    println("Countries: ${countryCapitalMap.keys}")
    println("Capitals: ${countryCapitalMap.values}")
    countryCapitalMap.remove("Germany")
    println("Final Map: $countryCapitalMap")
    // Part 4
    val carBrands = arrayListOf("GMC", "BMW", "TOYOTA")
    carBrands.add("AUDI")
    carBrands.add("FORD")
    carBrands.remove("GMC")
    println(carBrands)
    // Part 5
    val collectionOperations = listOf(10, 5, 20, 15, 25, 30)
    println(" Numbers > 15 are: ${collectionOperations.filter { it > 15 }}")
    // Part 6
    val floatingNumbers = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    // Realized here that using minOrNull() instead of min() is safer to avoid null exceptions if the list was empty
    println("Largest number: ${floatingNumbers.maxOrNull()}\n" +
            "Smallest number: ${floatingNumbers.minOrNull()}")
}