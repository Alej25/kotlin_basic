package com.example.koltinbasics1

fun main(){
    newTopic("sentencias condicionales ");
    subtopic("if");
    if (true){
        println("conexion existosa");
    }
    //metodo equality
    subtopic("Equiality")
    if (1==1){
         println("1 es igual a 1 ")
    }
    //equals
    subtopic("Equals")
    val al = "jorge"
    if (al.equals("jorge")){
        println("es el mismo nombre")
    }
    //operadores logicos
    subtopic("Logical Operators")
    if (1!=2){  println("1 es diferente a 2") } //not
    if (1==1 || 1<2){ println("1 es igual a 1 o menor a 2") } // or
    if  (1!=2 && 1<2){ println("1 es diferente y menor que 2 ")}// and
    if (1==1){
        if (1<2){
            println("esto es un if anidado ")
        }
    }
   // else if
    subtopic("if & else");
    val a=5;
    val b=10;
    if(a < b){
        println("a es menor que b ")
    } else if (a==b){
        println("a es igual a b")
    }else{
        println(" la comparacion entre else if y else esta dada y a es menor que b")
    }
    //when
    subtopic("sentencia when ")
    val name = "paola"
    when(name){
        "karina" -> println("hola karina")
        "raul"  -> println("hola raul ")
        "jorge",
            "paola"  -> println("hola jorge y paola")
        else -> println("hola desconocida")
    }

   //Estructura de datos
    newTopic("collections")
    //vararg
    subtopic("vararg")
    multiArguments("jorge", "paola ","x")

    //arrays
    subtopic("arrays")
    val array = arrayOf ( 'p', 'a' ,'o','l', 'a'  );
    println(array[2] )
    println(array[4])
    val arrayStr:String = "paola";
    println(arrayStr[0])


    //listOf arreglos de solo lectura
    subtopic("list")
    val lista = listOf<String>("jorge","alejandro ","macias ","perez");
    println("la lista contiene : $lista");
    println("el tercer dato es : ${lista.get(2)}")

    //multable list of
   subtopic("multablelistof ");
    val mutablelist = mutableListOf<String>("Mariana", "Gabriela", "Angela", "Albany", "paola")
    println("multablelist : $mutablelist");
    mutablelist.add("Rusia");
    println("Add: $mutablelist");
    mutablelist.removeAt(1);
    println("RemoveAt : $mutablelist");
    mutablelist.remove("Mariana");
    println("Remove: $mutablelist");
    mutablelist.set(1,"Paola")
    println("set : $mutablelist");

    //diccionario o map
    subtopic("map")
    val mutablemap  = mutableMapOf<String, String>();
    mutablemap.put("Mar","Mariana")
    mutablemap.put("Alb","Albany")
    mutablemap.put("Pao","Paola")
    println("Map: $mutablemap")
    println("con la clave : ${mutablemap.get("Pao")}")
    mutablemap.remove("Mar");
    println("Map: $mutablemap")
    mutablemap.set("RUS","Rusia")
    println("Map: $mutablemap")
    println(mutablemap.keys)
    println(mutablemap.values)

    //arreglo null sin valor pero si una longitud
    subtopic("array null")
    val nullArray = arrayOfNulls<String>(3)
    nullArray[0] = "jose"
    println(nullArray[0]);
    println(nullArray[1])

    //metodos de colecciones mas  comunes
    subtopic("methods collections")
    println(lista);
    println("Short: ${lista.sorted()}")
    println("reverse: ${lista.reversed()}")
    println("index Perez: ${lista.indexOf("perez")}")

    //loops
    newTopic("bucles")
    subtopic("for")
    loops ("jorge","alejandro ","macias ","perez");

    newTopic("tarea")
    // encontrar cual dato es la posicion 4
    var nombres = mutableListOf<String>("juan","pepito","pedro","carlos","saul");
    for(i in 0..nombres.size -1 )
    {
         if(i==3  ){
             println("En la posicion 4 es : ${nombres.get(i)} ")
         }
        println("posision ${i + 1}")
    }
}

fun loops(vararg name:String ) {
 for (i in 1..10){
     println(i)
 }
    for(i in 0..name.size -1){
        println("$i = ${name.get(1)}");
    }
    for (name in name){
        println( name);

    }
    subtopic("foreache")
   name.forEach {
       println(it)
   }
    (1..5).forEach {
        println(it)
    }
    // while
    subtopic("while")
    var index = 0 ;
    println(name.size);
    while (index<name.size){
        println(" el indice es $index : el nombre del indiece es ${name.get(index)}")
        index++;
    }
    subtopic("do while ")
    do {
        println(" el arreglo tiene $index")
        index--
        println(" el indice es $index : el nombre del indiece es ${name.get(index)}")
    }while (index > 0)

    //return y breake
    subtopic("return ")
    (1..5).forEach {
        if(it == 3){
            return@forEach

        }
        println(it)
    }
    subtopic("break")
    for (i in 1..5){
        if (i==3) {
            break
        }
        println(i)
    }

}

fun multiArguments(vararg name:String){
    println("vararg en posicion 0:${name[0]}")
}