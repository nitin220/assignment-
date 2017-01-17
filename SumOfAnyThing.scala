//Ques-4:-Using higher order functions.


package com.knoldus.assignment_3


class SumOfAnyThing {    //class that is providing actual implementation code
  def higherOrderFunction(function:(Int,Int)=>Int,element_1:Int,element_2:Int):Int= {
    val result=function(element_1,element_2)
    result

  }
}
 object SayWhatYouWantToAdd{  //object that carries main function
   def main(args: Array[String]) {
     val obj=new SumOfAnyThing //object through which we are calling the SumOfAnyThing function
     val operand_1=4
     val operand_2=5
     val result_1=obj.higherOrderFunction((operand_1,operand_2)=>operand_1*operand_1+operand_2*operand_2,operand_1,operand_2)
     println(s"$result_1 = $operand_1 * $operand_1 + $operand_2 * $operand_2")
     val result_2=obj.higherOrderFunction((operand_1,operand_2)=>operand_1*operand_1*operand_1+operand_2*operand_2*operand_2,operand_1,operand_2)
     println(s"$result_2 = $operand_1 * $operand_1 * $operand_1 + $operand_2 * $operand_2 * $operand_2")
     val result_3=obj.higherOrderFunction((operand_1,operand_2)=>operand_1+operand_2,operand_1,operand_2)
     println(s"$result_3 =  $operand_1 + $operand_2 ")
   }
 }
