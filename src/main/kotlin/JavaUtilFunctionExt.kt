package io.toolisticon.kotlin

import java.util.function.*
import java.util.function.Function

object JavaUtilFunctionExt {

  operator fun <T : Any?> Consumer<T>.invoke(t: T) = this.accept(t)
  operator fun <T : Any?, U : Any?> BiConsumer<T, U>.invoke(t: T, u: U): Unit = this.accept(t, u)
  operator fun DoubleConsumer.invoke(num: Double) = this.accept(num)
  operator fun IntConsumer.invoke(num: Int) = this.accept(num)
  operator fun LongConsumer.invoke(num: Long) = this.accept(num)
  operator fun <T : Any?> ObjDoubleConsumer<T>.invoke(t: T, num: Double) = this.accept(t, num)
  operator fun <T : Any?> ObjIntConsumer<T>.invoke(t: T, num: Int) = this.accept(t, num)
  operator fun <T : Any?> ObjLongConsumer<T>.invoke(t: T, num: Long) = this.accept(t, num)

  operator fun <T : Any?, R : Any?> Function<T, R>.invoke(t: T): R = this.apply(t)
  operator fun <R : Any?> IntFunction<R>.invoke(num: Int): R = this.apply(num)
  operator fun <R : Any?> LongFunction<R>.invoke(num: Long): R = this.apply(num)
  operator fun <R : Any?> DoubleFunction<R>.invoke(num: Double): R = this.apply(num)
  operator fun DoubleToIntFunction.invoke(num: Double): Int = this.applyAsInt(num)
  operator fun DoubleToLongFunction.invoke(num: Double): Long = this.applyAsLong(num)
  operator fun IntToDoubleFunction.invoke(num: Int): Double = this.applyAsDouble(num)
  operator fun IntToLongFunction.invoke(num: Int): Long = this.applyAsLong(num)
  operator fun LongToDoubleFunction.invoke(num: Long): Double = this.applyAsDouble(num)
  operator fun LongToIntFunction.invoke(num: Long): Int = this.applyAsInt(num)
  operator fun <T : Any?> ToDoubleFunction<T>.invoke(t: T): Double = this.applyAsDouble(t)
  operator fun <T : Any?> ToIntFunction<T>.invoke(t: T): Int = this.applyAsInt(t)
  operator fun <T : Any?> ToLongFunction<T>.invoke(t: T): Long = this.applyAsLong(t)

  operator fun <T : Any?, U : Any?, R : Any?> BiFunction<T, U, R>.invoke(t: T, u: U): R = this.apply(t, u)
  operator fun <T : Any?, U : Any?> ToDoubleBiFunction<T, U>.invoke(t: T, u: U): Double = this.applyAsDouble(t, u)
  operator fun <T : Any?, U : Any?> ToIntBiFunction<T, U>.invoke(t: T, u: U): Int = this.applyAsInt(t, u)
  operator fun <T : Any?, U : Any?> ToLongBiFunction<T, U>.invoke(t: T, u: U): Long = this.applyAsLong(t, u)


  operator fun <T : Any?> UnaryOperator<T>.invoke(t: T): T = this.apply(t)
  operator fun DoubleUnaryOperator.invoke(num: Double): Double = this.applyAsDouble(num)
  operator fun IntUnaryOperator.invoke(num: Int): Int = this.applyAsInt(num)
  operator fun LongUnaryOperator.invoke(num: Long): Long = this.applyAsLong(num)

  operator fun <T : Any?> BinaryOperator<T>.invoke(t1: T, t2: T): T = this.apply(t1, t2)
  operator fun DoubleBinaryOperator.invoke(num1: Double, num2: Double): Double = this.applyAsDouble(num1, num2)
  operator fun IntBinaryOperator.invoke(num1: Int, num2: Int): Int = this.applyAsInt(num1, num2)
  operator fun LongBinaryOperator.invoke(num1: Long, num2: Long): Long = this.applyAsLong(num1, num2)

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

}
