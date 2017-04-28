package defaults


//Class that implements.
class Usage : KDefaults {
    override fun baz() {
        println("Hi, I'm usage :D")
    }
}

//Class that is so lazy that uses others to have a behavior
class NotImplementer(usage: Usage) : KDefaults by usage //<- Introducing delegation
