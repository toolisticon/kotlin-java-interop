package io.toolisticon.kotlin

import java.util.function.*
import java.util.function.Function

object JavaUtilFunctionExt {

  operator fun <T : Any?> Consumer<T>.invoke(t: T) = this.accept(t)
  operator fun <T : Any?, U : Any?> BiConsumer<T, U>.invoke(t: T, u: U): Unit = this.accept(t, u)
  operator fun DoubleConsumer.invoke(num: Double) = this.accept(num)
  operator fun IntConsumer.invoke(num: Int) = this.accept(num)
  operator fun LongConsumer.invoke(num: Long) = this.accept(num)

  operator fun <T : Any?, R : Any?> Function<T, R>.invoke(t: T): R = this.apply(t)
  operator fun <T : Any?, U : Any?, R : Any?> BiFunction<T, U, R>.invoke(t: T, u: U): R = this.apply(t, u)
  operator fun <R : Any?> IntFunction<R>.invoke(num: Int): R = this.apply(num)
  operator fun <R : Any?> LongFunction<R>.invoke(num: Long): R = this.apply(num)
  operator fun <R : Any?> DoubleFunction<R>.invoke(num: Double): R = this.apply(num)

  operator fun <T : Any?> UnaryOperator<T>.invoke(t: T): T = this.apply(t)

  operator fun <T : Any?> BinaryOperator<T>.invoke(t1: T, t2: T): T = this.apply(t1, t2)
  operator fun DoubleBinaryOperator.invoke(d1: Double, d2: Double): Double = this.applyAsDouble(d1, d2)

  operator fun <T : Any?> Predicate<T>.invoke(t: T): Boolean = this.test(t)
  operator fun <T : Any?, U : Any?> BiPredicate<T, U>.invoke(t: T, u: U): Boolean = this.test(t, u)
  operator fun DoublePredicate.invoke(num: Double): Boolean = this.test(num)
  operator fun IntPredicate.invoke(num: Int): Boolean = this.test(num)
  operator fun LongPredicate.invoke(num: Long): Boolean = this.test(num)

  operator fun <T : Any?> Supplier<T>.invoke(): T = this.get()
  operator fun BooleanSupplier.invoke(): Boolean = this.asBoolean
  operator fun DoubleSupplier.invoke(): Double = this.asDouble
  operator fun IntSupplier.invoke(): Int = this.asInt
  operator fun LongSupplier.invoke(): Long = this.asLong

//  DoubleToIntFunction
//  DoubleToLongFunction
//  DoubleUnaryOperator
//  IntBinaryOperator
//  IntToDoubleFunction
//  IntToLongFunction
//  IntUnaryOperator
//  LongBinaryOperator
//  LongToDoubleFunction
//  LongToIntFunction
//  LongUnaryOperator
//  ObjDoubleConsumer
//  ObjIntConsumer
//  ObjLongConsumer
//  ToDoubleBiFunction
//  ToDoubleFunction
//  ToIntBiFunction
//  ToIntFunction
//  ToLongBiFunction
//  ToLongFunction


}
