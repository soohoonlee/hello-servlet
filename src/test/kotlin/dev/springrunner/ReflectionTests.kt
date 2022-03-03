package dev.springrunner

import org.junit.jupiter.api.Test

class ReflectionTests {

    @Test
    @Throws(Exception::class)
    fun objectCreateAndMethodCall() {
        val duck = Duck()
        duck.quack()

        val duckClass = Class.forName("dev.springrunner.ReflectionTests\$Duck")
        val duckObject = duckClass.getDeclaredConstructor().newInstance()
        val quack = duckObject.javaClass.getDeclaredMethod("quack", *arrayOfNulls(0))
        quack.invoke(duckObject)
    }

    internal class Duck {
        fun quack() {
            println("Quack!!")
        }
    }
}