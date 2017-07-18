package control

/**
  * Created by xchunzhao on 2017/7/18.
  * 循环
  */
object Loop {
  def main(args: Array[String]): Unit = {

    for (i <- 0 to 3) println(i)


    for (i <- 0 until  3) println(i)


    //for推导式
    for (i <- 0 to 3) yield println(2*i)



  }
}
