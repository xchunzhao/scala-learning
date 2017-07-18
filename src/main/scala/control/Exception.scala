package control

import java.io.FileNotFoundException

import scala.io.Source

/**
  * Created by xchunzhao on 2017/7/18.
  * 异常处理
  */
object Exception {
  def main(args: Array[String]): Unit = {
    val x = 0
    if (x>0) {
      println(x)
    } else {
      throw new IllegalArgumentException("value is illegal")
    }
  }
}
object Exception2 {
  def main(args: Array[String]): Unit = {
    try{
      val words = Source.fromFile("/Users/zhaoxc/test.txt").mkString
    } catch {
      case _ : FileNotFoundException => println("file not found")
      case ex : IllegalArgumentException => ex.printStackTrace()
    }
  }
}
