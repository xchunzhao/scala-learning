package process

import sys.process._
/**
  * Created by xchunzhao on 2017/7/19.
  */
object Example2 {
  def main(args: Array[String]): Unit = {
    /**
      * !跟!!的区别为!是返回结果直接输出到控制台，!!是个字符串
      */
    val rs = "ls -al .." #| "grep scala" !!

    /**
      * 跟shell类似 不过所有的操作符都需要加#
      * 如：#|  #> #>>
      */
  }
}
