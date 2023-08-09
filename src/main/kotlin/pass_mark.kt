fun main(args: Array<String>) {
    //val marks = 18
    print("Enter your marks: ")
    val marks: Int =Integer.valueOf(readLine())

    if(marks == 100 && marks>=80){
        println("Credit score")
    }
    else if(marks<80 && marks>=60){
        println("Distinction score")
    }
    else if(marks<60 && marks>=50){
        println("You have passed")
    }
    else if(marks<50 && marks>=0){
        println("You have failed")
    }
    else{
        println("Error input")
    }
}