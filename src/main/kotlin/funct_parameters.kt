fun getfullname(firstname:String,lastname:String=""):String{
    return if (lastname.isNotEmpty()){
        "$firstname $lastname"
    } else{
        firstname
    }
}
fun main(args: Array<String>) {
    //lambda functions

    val sum = {num1:Int,num2:Int -> num1 +num2}
    println("20+7= ${sum(20,7)}")
    val person=getfullname("Ronny","Mutembei")
    println("Hello $person")
    val correct = 15
    val total =35
    val score = calculatescore(correct,total)
    println("Your score is $score %")
}

fun calculatescore(correctanswers:Int,totalquestions:Int):Int{
    return (correctanswers*100)/totalquestions

}



