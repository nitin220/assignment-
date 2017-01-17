//Ques2. Question on Value Class


package com.knoldus.assignment_3

class FirstName(val first_name:String) extends AnyVal {
  override def toString = first_name

}

class LastName(val last_name:String) extends AnyVal{
  override def toString = last_name

}

class Age(val age:Int) extends AnyVal{
  override def toString() = "is of "+age+" years"

}
class Value_class{
  def displayDetails(first:FirstName,last:LastName,age:Age){
    println(s"$first $last $age")
  }
}
object UseOfValueClass{
  def main(args: Array[String]) {
    val obj=new Value_class()
    val obj_first=new FirstName("Nitin")
    val obj_last=new LastName("Aggarwal")
    val obj_age=new Age(23)
    obj.displayDetails(obj_first,obj_last,obj_age)

  }
}
