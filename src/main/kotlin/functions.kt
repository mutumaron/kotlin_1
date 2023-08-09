fun ronny(){
    println("This ia a user defined function")
}

fun main(args: Array<String>) {
    ronny()
    //add()
    val ans = sum(2,5)
    println(ans)
}
/*
fun add(){
    var num = 5
    var num2 =3
    println("The sum of $num and $num2")
}*/
fun sum(a:Int,b:Int):Int {
    var result = a + b
    return result

}