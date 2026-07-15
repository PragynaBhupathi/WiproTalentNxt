public class HOA1 {

    public static void main(String[] args) {

        FactorialClass obj = new FactorialClass();

        MyFactorial mf = obj::factorial;

        int result = mf.calculate(5);

        System.out.println("Factorial = " + result);
    }
}