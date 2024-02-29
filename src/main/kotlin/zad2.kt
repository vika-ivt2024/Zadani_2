package org.example

fun main(args: Array<String>) {
    val name= arrayOf("Frodo","Sam","Merry","Pippin")
    var x=0;
    while(x<5) {
        println("${name[x]} is a good Hobbit name")
        x+=1
    }
}