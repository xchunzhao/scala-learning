package process

import sys.process._
/**
  * Created by xchunzhao on 2017/7/19.
  */
object Example1 {
  def main(args: Array[String]): Unit = {
    "ls -al .." !
    val rs = "ls -al .." !!

    println(rs)
  }
}
