###  Scala延迟计算

[参考](http://lib.csdn.net/article/scala/27116)

##### Call by name 
scala解释器在解释函数参数时有两种方式，先计算参数表达式的值(reduce the arguments)，再应用到函数内部；或者是将未计算的参数表达式直接应用到函数内部。

前者叫做`传值调用（call-by-value）`，后者叫做`传名调用（call-by-name）`
```
object Add {  
  def addByName(a: Int, b: => Int) = a + b   
  def addByValue(a: Int, b: Int) = a + b   
}
```
示例：
```
addByName(2, 2+2）
-> 2+(2+2)
-> 2+4
-> 6


addByValue(2, 2+2)
-> addByValue(2,4)
-> 2+4
-> 6
```

#####  匿名函数
匿名函数有如下两种方式定义：
```
   val test = (x:Double) => 3 * x
   def test1(x:Double) = 3 * x
```
##### 延迟计算
```
def delay[A](v: =>A)={() => v}
```
上述函数，参数为v，类型为A，call by name方式，`{() => v}`为函数体，返回值为v

```
def compute[A](dv: ()=>A)=dv()
```
存在一个compute函数，参数是一个匿名无参函数，函数体是执行这个匿名无参函数。

```
 1:val x = delay(println(Calendar.getInstance().getTime + "    x"))
 2:println(Calendar.getInstance().getTime)
 3:Thread.sleep(1000)
 4:compute(x)
 
 
 result:
 Tue Aug 08 11:45:20 CST 2017
 Tue Aug 08 11:45:21 CST 2017    x
```
可以看出，在执行delay函数的时候，并没有执行内部函数，只是将参数直接返回。而是在执行compute函数的时候，才是真正执行函数的时间。