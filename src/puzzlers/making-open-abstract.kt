package puzzlers

open class A {
    open fun a() {}
}

abstract class B: A() {
    abstract override fun a()
}
// 与 extensions are resolved statically 冲突，暂时注释掉
//open class C: B() {
//    override fun a() {
//        TODO("Not yet implemented")
//    }
//}