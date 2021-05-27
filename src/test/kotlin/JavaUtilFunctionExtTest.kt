package io.toolisticon.kotlin

import io.toolisticon.kotlin.JavaUtilFunctionExt.invoke
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.concurrent.atomic.AtomicReference
import java.util.function.BinaryOperator
import java.util.function.Consumer
import java.util.function.Predicate


internal class JavaUtilFunctionExtTest {

  @Test
  internal fun `consumer invoke`() {
    val store = AtomicReference<String>(null)

    val storeText = Consumer<String> { store.set(it) }

    storeText("hello")

    assertThat(store.get()).isEqualTo("hello")
  }

  @Test
  internal fun `predicate invoke`() {
    val isGtFive = Predicate<Int> { it > 5 }

    assertThat(isGtFive(6)).isTrue
  }

  @Test
  internal fun `binaryOperator invoke`() {
    val multiply = BinaryOperator<Int> { a, b -> a * b }

    assertThat(multiply(2, 3)).isEqualTo(6)
  }
}
