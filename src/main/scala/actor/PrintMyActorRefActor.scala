package actor
import akka.actor.{Actor, ActorSystem, Props}

class PrintMyActorRefActor extends Actor {
  override def receive: Receive = {
    case "printit" =>
      val secondRef = context.actorOf(Props.empty, "second-actor")
      println(s"Second: $secondRef")
  }
}

object PrintMyActorRefActor {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("printMyRefActor")
    val firstRef = system.actorOf(Props[PrintMyActorRefActor], "first-actor")
    println(s"First : $firstRef")
    firstRef ! "printit"
  }
}
