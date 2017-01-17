//Second assignment
//Ques4- Double all the elements of a list using map.
class Double {
  val list_1=List(2,4,6,7)
  val list_2=for(value<- 0 to list_1.length-1) yield (list_1(value)*2)
  println(list_2.toList)

}

object  Element_double{
  def main(args: Array[String]) {
    val obj=new Double()
  }
}