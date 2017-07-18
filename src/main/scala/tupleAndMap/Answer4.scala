package tupleAndMap

import scala.io.Source

/**
  * Created by xchunzhao on 2017/7/18.
  */
object Answer4 {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("file.txt").mkString
    val words = file.split("\\s+")

    var map = Map[String, Int]()
    for (s <- words) {
      map += (s.replace(".","") -> (map.getOrElse(s,0) + 1))
    }

    println(map)
  }
}
