package array

/**
  * Created by xchunzhao on 2017/7/18.
  * 编写循环，将整数数组相邻元素交换
  */
object Answer1 {
  def main(args: Array[String]): Unit = {
    val s = Array(1,2,3,4,5)

    for (i <- 0 until (s.length-1,2)) {
      val t = s(i)
      s(i) = s(i+1)
      s(i+1) = t
    }
    println(s.mkString(" "))
  }
}
