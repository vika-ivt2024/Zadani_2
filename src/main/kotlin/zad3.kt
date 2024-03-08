package org.example

fun zadan1(args: Array<String>) {
    var x=1
    while(x < 3){
        if(x==1){
            println("Yabb")
        }
        else{
            println("\bDabba")
        }
        x=x+1
    }
    if(x==3){
        println("\bDo")
    }
}


fun zadani3(args: Array<String>) {
    val name= arrayOf("Pugh","Pugh","Barney McGrew","Cuthbert","Dibble","Grub")
    var x=0;
    var i=0;
    while(x<6) {
        i+=1
        println("Fireman number ${name[x]} is $i")
        x+=1
    }
}