//Ques 4:- Program to sum of the digits of the product of numbers from 1 to n.

//----- THIS PROGRAM WILL EXPECT A COMANDLINE ARGUMENT FROM THE USER--------

class Product
{
	def factorial(number:Int):Int=
		if(number==0) 1 else number * factorial(number-1)
}

object SumOfProduct
{
	def main(args: Array[String])=
	{
		val input=args(0).toInt
		val Object=new Product()
		var product=Object.factorial(input)
		val holder=product
		var sum=0
		var remainder=0
		while(product!=0)
		{
			remainder=product%10
			sum+=remainder
			product=product/10
		}
		println(s"Product of $input is $holder and sum of product is $sum")
	}
}