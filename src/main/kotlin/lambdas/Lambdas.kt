package lambdas

fun main(args: Array<String>) {
    foo(SAMInterface {

    })
    bar(FSAMInterface {

    })


    //But it's not the kotlin way...
    baz({
        //Do stuff
    })
    //This is the kotlin way!
    baz {
        //Do something
    }

    baz { it * 2 }
    baz { x: Long -> x * 1000 }
    baz { x -> x * 8000 }

    val operation = { x: Long ->
        //Do something
    }
    baz(operation)

    val explicit: (Long) -> Unit = { x: Long ->
        // Stuff
    }
    baz(explicit)

    //Even...
    baz(fun(x){
        //HELL YEAH
    })

    fooWithUnused { _, _, c ->
        println(c)
    }


    //Method reference
    baz(::operationFun)
}

fun foo(sam: SAMInterface) {

}

fun bar(fsam: FSAMInterface) {

}

fun baz(operation: (Long) -> Unit) {

}



fun operationFun(x: Long){

}

fun fooWithUnused(operation: (Long, Int, Char) -> Unit){

}