//Ques 1:-Program using string interpolation and a list, and printing index and value of list.


class Place{                   //Place class because in this question we are determine the index of elements in a list
	
	val source=List(10,20,30,40)    //this is the source list
	
	var index=0                  //This is variable for the index number and it is var because it will change its value with each iteration
	
	for(numbers <- source)
	{
		println(s"$index = $numbers")
		index+=1	
	}
}

object Display{  
	def main(arg:Array[String])={
		val Temp=new Place()
		}
}
