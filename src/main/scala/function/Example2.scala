package function

/**
  * Created by xchunzhao on 2017/7/19.
  * 实用的高阶函数
  */
object Example2 {
  def main(args: Array[String]): Unit = {
    //1、map 快速打印0-9
    (0 to 9).map(0.1 * _).foreach(println _)
    //2、filter 找出0-9中偶数
    (0 to 9).filter(_ % 2 == 0).foreach(println _)
    /**
      * 3、reduce 求累积
      * 同样还有 reduceLeft reduceRight
      */
    println((1 to 9).reduce(_ * _))
    //4、sortWith
    "Happy birthday to u".split("\\s+").sortWith(_.length < _.length).foreach(println _)
    //5、sortBy
    "Happy birthday to u".split("\\s+").sortBy(x => x.length).foreach(println _)
  }
}
