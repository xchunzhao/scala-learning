package function

object LazyCal {
  //
  def delay[A](v: => A) = {() => v}

  def calculate[A](cv:  () => A) = cv()

  def main(args: Array[String]): Unit = {
    import java.util.Calendar
    val x = delay(println(Calendar.getInstance().getTime + "    x"))
    println(Calendar.getInstance().getTime)
    Thread.sleep(1000)
    calculate(x)
  }
}
