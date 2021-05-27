# kotlin-java-interop

Extensions for kotlin/java interoperability

[![Build Status](https://github.com/toolisticon/kotlin-java-interop/workflows/Development%20branches/badge.svg)](https://github.com/toolisticon/kotlin-java-interop/actions)
[![sponsored](https://img.shields.io/badge/sponsoredBy-Holisticon-RED.svg)](https://holisticon.de/)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.toolisticon.kotlin/kotlin-java-interopt-bom/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.toolisticon.kotlin/kotlin-java-interopt)

When you are writing libraries and tools in kotlin that are supposed to also be used from java, it is a good idea to use the java Functional interfaces (Function, Consumer, Supplier, ...) instead of kotlin lambda functions, so java developers can easily use and implement your features.

But this means, that you also have to work with java syntax when you are using the lib from kotlin. The `kotlin-java-interop` library aims to combine the best of those two worlds: expose your features as java functions, but still have a convenient access when working with kotlin.

## Features

### `invoke()` for `java.util.function.*`

This is mainly achieved by providing `operator fun ... invoke()` extensions for the most common java interfaces.

You can implement a feature class in kotlin, exposing a java interface:

```kotlin
val multiply = BinaryOperator<Int> { a,b -> a * b }
```

and use it from java as usual

```java
Integer fourTimesFive = multiply.apply(4, 5); 
```

because multiply really _is_ a java binaryOperator, but when using kotlin, leverage this lib and write:

```kotlin
import io.toolisticon.kotlin.JavaUtilFunctionExt.invoke

val fourTimesFive = multiply(4, 5) 
```

as if it would be a `(Int,Int) -> Int` lambda function.

## Design

This lib is designed to be as usable as possible, without being too invasive to your code base and dependency tree. Consequentially, it does not require any transitive dependencies.
It just uses the core features provided by **JDK 11.x** and **Kotlin 1.5.x**.
