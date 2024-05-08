package iterator

import org.example.iterator.MyContainer
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class MyContainerTest{
    val stu = arrayOf("bob","alice","sam")
    val container = MyContainer<String>(stu)

    @Test
    fun testIterator(){
        while (container.iterator().hasNext()){
            println(container.iterator().next())
        }
    }
}