class People(val name:String,val age:Int,val gender:String) {
    fun jitambulishe() {
        println("Hi my name is $name and im a $age year old $gender")
    }

//    member function to have a birthday

    fun havebirthday(){
//        age++
    println("$name just turned $age")
    }

}

fun main(args: Array<String>) {
//    create an instance (obects) of class
    val watu = People("Ronny",81,"Male")
    val student = People("Newton",19,"Male")
    val players =People("Ronaldo",38,"Male")

    watu.jitambulishe()
    watu.havebirthday()
    student.jitambulishe()
    student.havebirthday()
    players.jitambulishe()
    players.havebirthday()

}