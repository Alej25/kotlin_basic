package com.example.koltinbasics1

class Admin(fistName:String,lastName : String, var officeNumber : Short) : Person(fistName,lastName){
    override fun showWork(): String {
        return super.showWork() + "en la oficina :  $officeNumber  \t"  + "agendando "
    }
}