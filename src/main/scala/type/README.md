### scala类型参数

* ##### 泛型函数  

    ```
    def getMiddle[T](a:Array[T]) = a(a.length/2)
    ```

* ##### 类型变量界定
    * 上界 A<:B     限定A的类型必须是B的子类型
    * 下界 A>:B     限定A的类型必须是B的父类型
    * 视图界定: A<%B   限定A能隐式转换到B
    
* ##### 型变
    * 协变
    ```
    class Pair[+T](val first:T, val second:T)
    +号意味着该类型跟T是协变的，与T按同样的方向型变。
    ```
    * 逆变
    ```
    trait Friend[-T] {
        def beFriend(someone:T)
    }
    -号意味着该类型与T按相反的方向型变。
    ```
    
    
* ##### 协变逆变点
```

```