package fr.chsfleury

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("fr.chsfleury")
		.start()
}

