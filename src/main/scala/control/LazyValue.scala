package control

import scala.io.Source

/**
  * Created by xchunzhao on 2017/7/18.
  * 惰性值
  */
object LazyValue {
  def main(args: Array[String]): Unit = {
    /**
      * 惰值
      * 当val被声明为lazy时，他的初始化被延迟，直到首次使用它
      * 文件名拼错，不会出现FileNotFoundException
      */
    lazy val words = Source.fromFile("/Users/zhaoxc/test1.txt").mkString
  }
}
