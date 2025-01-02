# Scala NullPointerException Bug

This example demonstrates a common NullPointerException in Scala when dealing with methods that take objects as arguments and those objects can be null.  The `add` method in `MyClass` doesn't handle the case where `other` might be null, leading to a runtime crash.  The solution focuses on safe null handling.

## How to Reproduce

1.  Compile and run the provided `MyClass.scala` file.
2.  Observe the NullPointerException when `obj1.add(obj3)` is executed. 