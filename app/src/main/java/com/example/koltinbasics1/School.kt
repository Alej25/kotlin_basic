package com.example.koltinbasics1

 data class School(var name : String,var address :String,val active : Boolean = true,var numCode:String ="") {
   var staff :MutableList<Person>
   private var tipeShcool :TypeSchool = TypeSchool.FEDERAL


   //creamos un metod como main pero en la clase llamada init
   init {
       staff= mutableListOf()
   }
    constructor():this("","")

    constructor(name: String,address: String,staff:MutableList<Person> ):this(name,address){
  this.staff = staff
    }
//funcion que me retorna un string
    fun getType():String = tipeShcool.tipe

     // metodo equals para compara do atributos de dos objetos creados
     override fun equals(other: Any?): Boolean {
         if (this === other) return true
         if (javaClass != other?.javaClass) return false

         other as School

         if (numCode != other.numCode) return false

         return true
     }

     override fun hashCode(): Int {
         return numCode.hashCode()
     }

     // es necesario sobreescribir el metodo tostring para ppder regresar un valor
  /*  override fun toString(): String {
        if (active) {
            return if (staff.size>0){
                "name : $name at $address  , with ${staff.size} members "

            } else{
                "name : $name at $address "
            }

        }else{
            return "Escuela inactiva"
        }

    }*/


    companion object{
        const val ACTIVE = true
        const val INACTIVE= false

    }

}