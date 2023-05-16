package com.example.koltinbasics1


 var username = "Al"  // variable global
 const val SPECIES = "human "
const val separator="==================="

fun main(){
 print("hola mundo ")
println()

 newTopic(  "variables")
 //  vaiables
 // una de las diferencias entre var y val es que var puede cambiar su valor ,val no puede ser asicgnada
 var age = 22;
println(age)
 val name = "jorge"
 println(name)
// para declarar una varaible dond esu valor tenga que reservasrse despues
 var job : String
  job ="developer "
 println(job)
 var languaje  = "kotlin"
// variables globales
 println(username)
 // constantes
 println(SPECIES)
// string templates
 println("Mi name is $name")
 //tipos de datos
 val string: String ="al"
 println(string)

 newTopic("tipos de datos ")
 val boolean:Boolean=true  //true =1 false =0  <---1bit
 val jobs:Byte=3//8 bits  -128
 val workeday: Short  = 200 //16 bits -32768
 val workminutes : Int =28800 //32 bits -2,147,483
 val workinmilisecond :Long  =  1728000  //64 bits
 val heightdouble: Double=1.7555555555

 newTopic("funciones ")
//funciones
 basic()
 arguments(name)
 println(returnDates())
//sobrecarga
 overload(age)
 overload(job)
 overload(job,languaje)
}

fun overload(job: String, languaje: String) {
  println("Mi trabajo es :  $job con $languaje" )
}

fun overload(job: String) {
  println("Mi trabajo es : $job")
}

fun overload(age: Int) {
  println("MI edad es $age")
}

fun returnDates(): String {
  return "datos retornados"
}

fun arguments(name: String) {
  println("hola  $name")
}

fun basic(){
 println("hi")

}
fun newTopic  (topic: String ){
/*
 println()
 print("================== ")
 print(topic)
 print("================== ")
 println()
*/

 print("\n$separator $topic $separator\n")
}

fun subtopic (subtopic: String){
 print("\n$separator $subtopic\n")

}