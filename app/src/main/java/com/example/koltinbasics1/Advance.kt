package com.example.koltinbasics1

fun main(){
    newTopic("metodos string ")

    val course = "Kotlin course by cursos Android ANT"
    val target = "Android"

    println(course.length) // ver logitud
    println(course.compareTo(target)) // comprar la primera con la segunda
    println("android".equals(target)) // ver si la palabra esta en la variable
    println(course.contains(target))  // ver si en course se encuentra la palabra traget


    println(course.toLowerCase()) // poner todo el texto en minuculas
    println(course.toUpperCase()) // poner todo el texto en mayusculas
    println(course.subSequence(0,10))  // hacer una impresion solo el recorrido establecido
    print(course.indexOf("N")) // verhast adonde encontrams un caracter asi
    println("\n")
    val empity=  ""
    println(empity.isBlank()) // tenga datos
    println(empity.isEmpty()) // este vacio
    println(empity.lastIndexOf("n")) //
    println(course.toLowerCase().lastIndexOf("n"))

    println(course.replace('c' , 'k'))
    println(course.toLowerCase().replace("an"," os"))
    println(course.replaceBefore("by" , "only"))
    println(course.reversed())

 // null
    newTopic("null safety")
    subtopic("?")
    var nullStr :String? = null
    println(nullStr)
    print(nullStr?.get(0))

    // not null
  nullStr= "hola "

    println(nullStr.get(0))
    showMessage(nullStr)

  // operador elvis 
    subtopic("elvis")
    nullStr= null
    val elvis = nullStr ?: "java"
    println(" yo programo en $elvis")

}
private fun showMessage(msg:String? ){
    println("? ${msg?.get(0 )}")

}