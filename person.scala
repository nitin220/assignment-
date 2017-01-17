//Ques1. Question on Ordered trait



package com.knoldus.assignment_3

class Person(val name:String,val age:Int) extends Ordered[Person]{ //class taking two class parimeters 
   def compare(that:Person)={
     if(this.name==that.name) this.age-that.age
     else this.name.length-that.name.length

   }
}

object Comparison{ //object having main function
  def main(args: Array[String]) {
    val obj_1=new Person("Nitin",23)
    val obj_2=new Person("Prashant",23)
    println(obj_1>obj_2)
    val obj_3=new Person("Nitin",27)
    val obj_4=new Person("Nitin",24)
    println(obj_3>obj_4)
  }
}
