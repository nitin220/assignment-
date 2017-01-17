//Second assignment
// Ques 1-Given two lists of integers, list1 and list2. Create a list of sums of the corresponding elements.
class Lists {
  val list_1=List(10,20,30)
  val list_2=List(1,2,3)
  val list_4=for (cont <- 0 to list_1.length-1) yield list_1(cont)+list_2(cont)
  println(list_4.toList)
}

object ListAddition{
  def main(args: Array[String]) {

    val add=new Lists()
  }
}
