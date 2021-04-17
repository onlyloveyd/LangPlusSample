package nullablenumber;

public class NullableNumber {
    public static void main(String[] arg){
        int a = 100;
        Integer aBox = a;
        Integer aAnotherBox = a;

        int b = 10000;
        Integer bBox = b;
        Integer bAnotherBox = b;

        System.out.println(aBox == aAnotherBox); // true
        System.out.println(bBox == bAnotherBox); // false
    }
}
