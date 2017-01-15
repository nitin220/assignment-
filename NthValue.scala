//Ques3:- Program to get the nth Fibonacci value.

//----- THIS PROGRAM WILL EXPECT A COMANDLINE ARGUMENT FROM THE USER--------

class Fibonacci(value:Int)
{
	if(value==0)
		println(s"$value th Fibonacci value 0")
	if(value==1)
		println(s"$value th Fibonacci value 1")
	if(value==2)
		println(s"$value th Fibonacci value 1")
	if(value>2)
	{
		var term=0
		var first=1
		var second=1
		println("Fibonacci series is")
		print(s"0,$first,$second,")
		for(control<-2 to value-2)
		{
			term=first+second
			first=second
			second=term
			print(s"$term,")	
		}
		println()
		print(s"$value th term is $term")
	}
}

object NthValue
{
	def main(args: Array[String])=
	{
		var input=args(0).toInt
		val Object=new Fibonacci(input)
	}
}