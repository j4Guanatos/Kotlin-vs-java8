package type_inf


fun main(args: Array<String>) {
    val listOfNames = listOf("Sier", "Sierisimo")

    val listOfNicks: List<String> = listOf("Sierisimo", "Sier")

    val listOfTheSame = listOf<String>("Sier", "Sier")

    val listEmpty = listOf<String>()
    val listOfNumbers = listOf(2, 4)

    foo(listOf("Sier", "Sierisimo"))
    foo(listOfNames)
    foo(listOfNicks)
    foo(listOfTheSame)
}

fun foo(stringList: List<String>) {

}