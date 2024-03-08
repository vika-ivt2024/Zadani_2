package org.example

fun zadani2(args: Array<String>) {
    val name= arrayOf("Frodo","Sam","Merry","Pippin")
    var x=0;
    while(x<5) {
        println("${name[x]} is a good Hobbit name")
        x+=1
    }
}


fun zadani4(args: Array<String>) {
    val fruit = arrayOf("Apple","Banana","Cherry","Bluberry","Pomegranate")

    var y: Int;
    val index = arrayOf(1,3,4,2)

    //Здесь я поменяла 0 на -1
    var x=-1;
    while(x<4){
        x=x+1
        y=index[x]
        println("Fruit = ${fruit[y]}")
    }
}