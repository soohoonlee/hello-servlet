package dev.springrunner

import org.junit.jupiter.api.Test

class AnnotationAndReflectionTests {

    @Test
    @Throws(Exception::class)
    fun handleAnnotation() {
        val blogServiceClass = BlogService::class.java
        val component = blogServiceClass.getAnnotation(Component::class.java)

        println("name: ${component.name}")
    }

    @Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
    @Retention(AnnotationRetention.RUNTIME)
    internal annotation class Component(val name: String)

    @Component(name = "블로그 서비스")
    internal class BlogService {

    }
}