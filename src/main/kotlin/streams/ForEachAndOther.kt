package streams

fun main(args: Array<String>) {
    val listOfInteger = listOf(1,2,3,4)
    listOfInteger.forEach {

    }

    val arrayOfStrings = arrayOf("","S","Si","Sie","Sier")
    arrayOfStrings.forEach {

    }

    val map = mapOf("Sier" to "Chingon")
    map.forEach { k, v ->

    }
}

fun notStreams(){
    val listOfDoubles = listOf(2.0, 4.0, 8.0)

    val total = listOfDoubles.sum()

    val listOfNames = ResumeStream.getLongNames()

    val listOfUsefuleNames = listOfNames.filter(String::isNotBlank)
            .filter { it.length > 5 }
            .sortedBy { it.length }


    val maybeNothing = listOfNames.any {
        it.isEmpty()
    }
    val maybeOneOrException = listOfNames.first()
    val oneForSure = listOfNames.firstOrNull()
}