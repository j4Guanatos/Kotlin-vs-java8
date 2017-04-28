package defaults

//Interface with defaults
interface KDefaults {
    //One line implementation
    fun foo() = println("Foooooo")

    //More complex implementation
    fun bar(x: Double): Double {
        return Math.pow(2.0, x)
    }

    //Not implemented
    fun baz()
}


fun main(args: Array<String>) {
    //Call a function in another place...
    work()

    //Create object
    val notImplementer = NotImplementer(Usage())


    notImplementer.foo()
    println(notImplementer.bar(2.0))
    //Actually, this object contains the method...
    notImplementer.baz()
}
