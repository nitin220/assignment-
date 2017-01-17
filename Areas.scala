//Second assignment
//Ques3- Calculating area using higher order function
class Areas {
  def higherOrderFunction(caseInput:String,element_1:Int,element_2:Int,function:(Int,Int)=>Int):String={

    caseInput match {
      case "rectangle" =>
        val value_1=function(element_1, element_2)
        s"Area of rectangle is $value_1"


      case "rhombus" =>
        val value_2=function(element_1, element_2)
        s"Area of rhombus is $value_2"

      case "parallelogram" =>
        val value_3=function(element_1, element_2)
        s"Area of parallelogram is $value_3"

      case _ =>
        "Wrong Input"
    }


  }

}
object Calculate_Area{
  def main(args: Array[String]) {
    val obj=new Areas()
    val result_1:String=obj.higherOrderFunction("rectangle",20,23,(length,width)=>length*width)
    val result_2:String=obj.higherOrderFunction("rhombus",20,23,(length,width)=>length*width)
    val result_3:String=obj.higherOrderFunction("parallelogram",20,23,(length,width)=>(length*width)/2)
    val result_4:String=obj.higherOrderFunction("other",30,30,(length,width)=>(length*width)/2)
    println(result_1)
    println(result_2)
    println(result_3)
    println(result_4)
  }
}
