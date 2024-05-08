package org.example.iterator

// 定义一个迭代器接口
interface Iterator<T> {
    fun hasNext(): Boolean
    fun next() : T
}


// 定义一个容器接口
interface Container<T> {
    fun iterator(): Iterator<T>
}

// 定义一个具体的迭代器
class MyIterator<T>(private val items: Array<T>): Iterator<T>{
    private var index = 0

    override fun hasNext(): Boolean {
        return index < items.size
    }

    override fun next(): T {
        return items[index++]
    }
}

//定义一个具体的容器
class MyContainer<T>(private val items:Array<T>): Container<T>{
    override fun iterator(): Iterator<T> {
        return MyIterator(items)
    }
}