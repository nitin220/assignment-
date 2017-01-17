/**
  * Created by nitin on 17/1/17.
  */
class Fibbonacci_class {

  def fibo(number:Int):Array[Int]={
    require(number>=0)
    number match
    {
      case 1 =>
        Array[Int](0)
      case 2 =>
        Array[Int](0,1)
      case 3 =>
        Array[Int](0,1,1)
      case _ =>
        val series=new Array[Int](number)
        series(0)=0
        series(1)=1
        series(2)=1
        var previous_index=1
        var next_index=2
        def innerfibo(num:Int):Array[Int]=
        {
          require(num>0)
          var value_1=series(previous_index)
          var value_2=series(next_index)
          var value_3=value_1+value_2
          previous_index+=1
          next_index+=1
          series(next_index)=value_3
          innerfibo(num-1)
        }
        val result=innerfibo(number-3)
        result
    }
  }

}


object UsingTail{
  def main(args:Array[String])={
    val obj=new Fibbonacci_class()
    val result_series=obj.fibo(4)
    for(value<-result_series) println(value)

  }
}