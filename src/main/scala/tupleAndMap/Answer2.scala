package tupleAndMap

import scala.collection.JavaConverters.propertiesAsScalaMap
/**
  * Created by xchunzhao on 2017/7/18.
  */
object Answer2 {
  def main(args: Array[String]): Unit = {
    val props = propertiesAsScalaMap(System.getProperties())

    for ((k,v) <- props) {
      println(k + " | " + v)
    }
  }
}
