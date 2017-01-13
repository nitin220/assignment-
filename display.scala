class Place{ //Place class because in this question we are determine the 
	val source=List(10,20,30,40)
	var index=0
	for(numbers <- source)
	{
		println(s"$index=$numbers")
		index+=1	
	}
}

object display{
	def main(arg:Array[String])={
		val Temp=new Place()
		}
}
