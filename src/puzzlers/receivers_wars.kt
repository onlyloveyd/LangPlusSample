package puzzlers

fun foo() {
    print("Top-level rule")
}

class Foo {
    fun foo() {
        print("Extension receiver rule")
    }
}

class Test {
    fun foo() {
        print("Dispatch receiver rule")
    }

    fun Foo.foo() {
        print("Member extension function rule")
    }

    fun Foo.test() {
        foo()
    }

    fun testFoo() {
        Foo().test()
    }
}

fun main(args: Array<String>) {
    Test().testFoo()
}