```scala
class MyClass(val value: Int) {
  def add(other: MyClass): MyClass = {
    new MyClass(this.value + other.value) 
  }
}

object Main extends App {
  val obj1 = new MyClass(5)
  val obj2 = new MyClass(10)
  val result = obj1.add(obj2)
  println(result.value) // prints 15

  // The following will cause a NullPointerException if not handled
  val obj3: MyClass = null
  val result2 = obj1.add(obj3) // NullPointerException
  println(result2.value)
}
```