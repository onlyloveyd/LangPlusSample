package covariant

import java.util.*

open class Animal
class Dog : Animal()
class Cat : Animal()

fun main() {
    println(isInstanceOf<String>("1"))
}

/**
 * 类型擦除
 */
fun typeEraseSample() {
    val intList = ArrayList<Int>()
    val strList = ArrayList<String>()
    val isSameClass = intList.javaClass == strList.javaClass
    System.out.printf(isSameClass.toString())
}

// 利用反射完成骚操作
fun hackTypeErase() {
    val intList = ArrayList<Int>()
    intList.add(23)
    try {
        val method = intList.javaClass.getDeclaredMethod("add", Any::class.java)
        method.invoke(intList, Dog())
        method.invoke(intList, "yidong")
    } catch (e: Exception) {
        e.printStackTrace()
    }
    for (obj in intList) {
        println(obj)
    }
}

// covariant contravariant  invariant
// 泛型协变
fun covariantGeneric() {
    val objList: MutableList<out Animal> = MutableList(5) { Dog() }
    val animal = objList[0] //编译通过
//    val dog: Dog = objList[0] //编译报错
//    objList.add(Animal()) //编译报错
//    objList.add(Dog()) //编译报错
}

// covariant contravariant  invariant
// 泛型逆变
fun contravariantGeneric() {
    val objList: MutableList<in Dog> = MutableList(5) { Animal() }
//    val animal: Animal = objList[0] // 编译报错
//    val dog: Dog = objList[0] // 编译报错
//    val obj: Any? = objList[0] // 编译正常
//    objList.add(Animal()) //编译报错
    objList.add(Dog()) //编译通过
}

fun getLength(list: List<*>): Int {
    return list.size
}

inline fun <reified R> isInstanceOf(t: Any) = t is R