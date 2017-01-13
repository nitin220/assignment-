class MaxElement
{
   var repository=List(1,5,9,7)
   var maxValue=List(1)
   repository.foreach(temp : Int) => {
      if (temp > maxValue)
         maxValue=temp
     }
  println(s"Maximum value is $maxValue")
}
  object maxFind
  {
     def main(args: Array[String])={
      val obj=new MAxElement()
  }
}   
