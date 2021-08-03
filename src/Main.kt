



fun main() {
    // list with duplicate items

    val emails= mutableListOf<String>("user@1test.com")
    for (i in 1..50000) {
        val element= "user$i@test.com"
        emails.add(element)
        emails.add(element)

    }
    println("emails"+emails)

    val distinct: List<String> = LinkedHashSet(emails).toMutableList()

   println("distinct emails"+distinct)            // [One, Two]
}
