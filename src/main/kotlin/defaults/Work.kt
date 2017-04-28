package defaults

fun work() {
    //create objects that implement KDefaults then you need to implement method
    val mIKDefs = object : KDefaults {
        override fun baz() {
            println("I'm a anonymous object...")
        }
    }

    println("::::::WORK::::::")
    println(mIKDefs.bar(4.0))
    mIKDefs.baz()
    println("::::::WORK::::::")
}
