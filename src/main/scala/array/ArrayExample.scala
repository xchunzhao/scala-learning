package array

/**
  * Created by xchunzhao on 2017/7/18.
  * 定长数组
  */
object ArrayExample {
  def main(args: Array[String]): Unit = {
    //初始化且能推断出类型Array[Int]，跟java中int[]一致
    val s = Array(1,2,3,4)
    println(s.isInstanceOf[Array[Int]])
    //数组访问
    println(s(2))
    //10个元素长度的数组,元素初始化为Int的默认值。不指定类型，初始化为null
    val s1 = new Array[Int](10)
    println(s1(0))
    //转换成ArrayBuffer
    println(s.toBuffer)

  }
}
