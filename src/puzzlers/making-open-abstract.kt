package puzzlers

open class A {
    open fun a() {}
}

abstract class B: A() {
    abstract override fun a()
}

open class C: B()