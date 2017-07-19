package tupleAndMap

/**
  * Created by xchunzhao on 2017/7/18.
  */
object Answer1 {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 20,"b" -> 30)
    val newMap = for ((k,v) <- map) yield k -> v * 0.9
    println(newMap)


    //rs: Vector((h,w), (e,o), (l,r), (l,l), (o,d))
    println("hello".zip("world"))
  }
}
