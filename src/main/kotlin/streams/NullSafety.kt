package streams

fun main(args: Array<String>) {
    //Nullable
    val notDoge: Meme? = null

    //Not happening bro
    notDoge?.createdAt.let(::println)

    //Also not happening
    notDoge?.name.let(::println)

    val aNullObject: ClassWithNull? = ClassWithNull(
            FullName(null, "Violencia"), null)

    println(aNullObject?.name?.firstName)
    println(aNullObject?.name?.lastName)

    // Throw a NPE (NullPointerException)
    aNullObject?.name?.firstName!!.let { println(it.length) }

    val neverNull: String = canReturnOrNot() ?: "Did not returned"

    println(neverNull)
}

data class FullName(var firstName: String?, var lastName: String?)

data class ClassWithNull(var name: FullName?, var age: Int?)

class Meme(val createdAt: String, val name: String)

fun canReturnOrNot(): String? =
        if (Math.random().toInt() % 2 == 0)
            "Returned"
        else
            null
