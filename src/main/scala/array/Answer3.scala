package array

import scala.collection.mutable.ArrayBuffer

/**
  * Created by xchunzhao on 2017/7/18.
  *
  */
object Answer3 {
  def main(args: Array[String]): Unit = {
    val s = Array(1,-2,3,-4,5,0)

    val buffer = new ArrayBuffer[Int](s.length)

    buffer ++= (for(a <- s; if a >0) yield  a)
    buffer ++= (for(a <- s; if a <= 0 ) yield a)

    println(buffer)
  }
}
