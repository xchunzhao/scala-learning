package array

import scala.collection.mutable.ArrayBuffer

/**
  * Created by xchunzhao on 2017/7/18.
  * 变长数组，类似java中ArrayList
  */
object ArrayBufferExample {
  def main(args: Array[String]): Unit = {
    val b = ArrayBuffer[Int]()

    //尾端添加一个元素
    b += 1
    println(b)
    //头端添加一个元素
    b.+=:(2)
    println(b)
    //尾端添加多个元素
    b += (4,5,6)
    println(b)
    //追加任意集合
    b ++= Array(7,8,9)
    println(b)
    //转成Array
    println(b.toArray.mkString(" "))
  }
}
