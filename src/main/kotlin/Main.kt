fun main(){
var myHuman =Humans ("Ruth",18,65)
    println(myHuman.weigth)
    println(myHuman.age)
    println(myHuman.name)
    println(myHuman.birthday())
    println(myHuman.speak("I am a student"))
    println(myHuman.eat(5))
    println(myHuman.weigth)
    val carenUser =User("Caren","Aluoch","aluochcaren@gmail.com","0734261936","vibes")
    println(carenUser.email)
    println(carenUser.phonenumber)

}
class Humans(val name:String,var age:Int,var weigth:Int){


    fun eat(foodweigth:Int){
        println("I am eating $foodweigth kgs of fruit")
        weigth+=foodweigth
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age += 1

    }
}
data class User(val Firstname:String,val Secondname:String,val email:String,val phonenumber :String,val password:String)
