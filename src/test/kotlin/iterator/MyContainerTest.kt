package iterator

import org.example.iterator.MyContainer
import kotlin.test.Test

class MyContainerTest{
    val stu = arrayOf("bob","alice","sam")
    val container = MyContainer(stu)
    val iterator = container.iterator()

    @Test
    fun testIterator(){
        while (iterator.hasNext()){
            println(iterator.next())
        }
    }
}