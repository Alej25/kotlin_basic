package com.example.koltinbasics1

// no se necesitaa grgar var o val cuando se herda

class Teacher(  firstName :String,  lastName:String , var students : Short ):Person(firstName ,lastName), Boss{
   var classroom :Classroom = Classroom(("N/A"))

    override fun showWork(): String {
        return super.showWork() + "\n dando clases ..."
    }

    override fun namePerson(): String =super.fullName()

    override fun netSalary(): Float = slary

    // se pueden declarar clases adentro de otras clases
     inner class Classroom( var key : String){
        override fun toString(): String {
            return "Classroom $key"
        }
        fun GetInfo () ="Classroom  $key with tacher $firtsName and $students students"
    }
}