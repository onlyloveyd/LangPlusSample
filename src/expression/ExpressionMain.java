package expression;

public class ExpressionMain {

    public static void main(String[] args) {

        int a = 100;
        Integer aBox = a;
        Integer aAnotherBox = a;

        int b = 199;
        Integer bBox = b;
        Integer bAnotherBox = b;

        System.out.println(aBox == aAnotherBox);
        System.out.println(bBox == bAnotherBox);

        int c = 100;
        Integer cBox = new Integer(c);
        Integer cAnotherBox = new Integer(c);
        System.out.println(cBox == cAnotherBox);

    }
}
