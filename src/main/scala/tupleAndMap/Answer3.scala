package tupleAndMap

/**
  * Created by xchunzhao on 2017/7/18.
  */
object Answer3 {
  def main(args: Array[String]): Unit = {
    val s = Array(2, 1, 4, 3, 80)
    println(maxMin(s))
  }

  def maxMin(array: Array[Int]) = {
    (array.min, array.max)
  }
}
