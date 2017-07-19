package function

/**
  * Created by xchunzhao on 2017/7/19.
  */
object Example1 {
  def main(args: Array[String]): Unit = {
    //匿名函数，以下两种写法相同
    val test = (x:Double) => 3 * x
    def test1(x:Double) = 3 * x


    //带函数参数的函数
    prettyPrint((x:Double) => 3 * x)

    //1、参数类型推断 可以写成
    prettyPrint(x => 3 * x)
    //2、参数在=>右侧只出现一次
    prettyPrint(3 * _)

  }

  def prettyPrint(x: (Double) => Double): Unit = {
    println(x)
  }
}
