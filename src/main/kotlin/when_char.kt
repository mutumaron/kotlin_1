fun main(args: Array<String>) {

    val marks = -1
    when(marks){
        in 1..9 -> println("Its a single digit number")
        in 10..99 -> println("Its double digit number")
        in 100..999 -> println("Its a triple digit number")
        else -> println("The number has more than three digits")
    }
}