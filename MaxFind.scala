//Ques2:- Program to find the maximum element from list.

class MaxElement
{
	val repository=List(1,5,9,7) //This is repository from which we have to find max value
   	var maxValue=repository(0)  //Asignint first value of list to a variavle named as maxValue 
				//and assuming that it is the maximum value in list
   	repository.foreach(temp => if(maxValue < temp) maxValue=temp)		
  	println(s"Maximum value is $maxValue")
}
	
object MaxFind
{
     	def main(args: Array[String])={
      	val Obj=new MaxElement()
  	}
}   
