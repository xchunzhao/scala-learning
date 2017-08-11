### Akka
```
Starting with Scala 2.11.0, the Scala Actors library is deprecated. Already in Scala 2.10.0 the default actor library is Akka.
```
从 Scala 2.10 开始，默认的actor已经是Akka了，然后从 Scala 2.11 开始 Scala 中的 actor 库已经被废弃.  

所以目前所涉及的actor都是在讲Akka   

参考[http://doc.akka.io/docs/akka/2.5.3/scala/guide](http://doc.akka.io/docs/akka/2.5.3/scala/guide)



##### Actor层级及生命周期(Hierarchy and Lifecycle of Actors)
```
The first use of the hierarchy is to manage the lifecycle of actors.   
Actors pop into existence when created, then later, at user requests, they are stopped.   
Whenever an actor is stopped, all of its children are recursively stopped too.   
This is a very useful property and greatly simplifies cleaning up resources and avoiding resource leaks (like open sockets files, etc.).   
In fact, one of the overlooked difficulties when dealing with low-level multi-threaded code is the lifecycle management of various concurrent resources.
```
Actor的层级制度的最大的用处就是管理Actor的生命周期。
Actor在创建的时候就存在，接着会在用户请求的时候结束。
不管一个Actor何时停止，它所有的子Actor也会相应的停止。
这是一个特别有用且很棒的特性来清理资源以及防止资源泄漏。