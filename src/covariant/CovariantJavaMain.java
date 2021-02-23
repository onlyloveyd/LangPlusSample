package covariant;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CovariantJavaMain {
    public static void main(String[] args) {
//        typeEraseSample();
        hackTypeErase();
    }

    public static void typeEraseSample() {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        boolean isSameClass = intList.getClass() == strList.getClass();
        System.out.printf(String.valueOf(isSameClass));
    }

    // 利用反射完成骚操作
    public static void hackTypeErase() {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(23);
        try {
            Method method = intList.getClass().getDeclaredMethod("add", Object.class);
            method.invoke(intList, new Dog());
            method.invoke(intList, "yidong");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Object object : intList) {
            System.out.println(object);
        }
    }

    // covariant contravariant  invariant
    // 泛型协变
    public static void covariantGeneric() {
        List<? extends Animal> objList = new ArrayList<Dog>() {{
            add(new Dog());
            add(new Dog());
        }};
        Animal animal = objList.get(0);//编译通过
//        Dog dog = objList.get(0);      //编译报错
//        objList.add(new Animal());     //编译报错
//        objList.add(new Dog());        //编译报错
    }

    // covariant contravariant  invariant
    // 泛型逆变
    public static void contravariantGeneric() {
        List<? super Dog> objList = new ArrayList<Animal>() {{
            add(new Animal());
            add(new Animal());
        }};
//        Animal animal = objList.get(0);     // 编译报错
//        Dog dog = objList.get(0);           // 编译报错
//        Object object = objList.get(0);     // 编译正常
//        objList.add(new Animal());     //编译报错
        objList.add(new Dog());        //编译通过
    }

    public static int getLength(List<?> list) {
        return list.size();
    }
}
