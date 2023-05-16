package com.example.koltinbasics1

fun main(){
  newTopic("POO")
   subtopic("class")
   println(School())

   // constructor
    subtopic("constructor ")
  val school = School("hary","calle principal #13");
    println(school);

  //override
  subtopic("override")
  val schoolInative = School("hary","calle principal #13",  false )
    println(schoolInative)

    //this<
    subtopic("this")
    val highSchool=School("Stan","Independencia#242",
        mutableListOf(Person("jose","Rodriguez")));
    println(highSchool)

    //propiedades y metodos
    subtopic("propiedades y metodos")
    val persona1 = Person("jorge", "Alejandro");
    println(persona1.fullName());
    println(persona1.showWork());
    persona1.slary = 1000f
    println(persona1.slary)

    //set y getter
    subtopic("set y get")
      persona1.tax= 20f
    println(persona1.slary)

    //herencia
    subtopic("Herencia ")
    val teacher = Teacher("alejandro" , "macias ", 45)
    highSchool.staff.add(teacher)
    println(highSchool)
    val admin= Admin("raul " , "ortiz",1)
    highSchool.staff.add(admin)
    println(highSchool)
    //super
    subtopic("super")
    println("teacher : ${teacher.showWork()}")
    println("andmin:  ${admin.showWork()} " )

    //encapsulacion
    subtopic("encapsulacion")
    println("no fue necesaria ")

    //companion object
    subtopic("companion object")
    println(School.ACTIVE)
    val schoolActive = School( " 0xf","vigo #2407 " ,School.ACTIVE)

    // clases enum
    subtopic("enum")
    println(schoolActive.getType())

  // nested  clases
    subtopic("Clases anidadas")
   println(teacher.classroom)
  teacher.classroom.key="4A"
  println(teacher.classroom)

  // inner
  subtopic("inner")
  println(teacher.classroom.GetInfo())

  // interface
  subtopic("interface")
  teacher.slary= 1000f
  val boss: Boss = teacher
  println(boss.namePerson())
  println(boss.netSalary())

  //data clase
  subtopic("data clase")
  println(schoolActive)
  println(schoolActive.component1())
  val schoolCopy = schoolActive.copy()
  schoolCopy.name = "ford"
  println(schoolCopy)

    // metodos equals & hascode
  subtopic("equal & hascode")
  schoolActive.numCode="356"
  schoolCopy.numCode="356"
  println(schoolActive.equals(schoolCopy))


}