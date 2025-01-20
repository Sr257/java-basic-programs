package exeption;

public class MathematicalCalculation {
    public static void main(String args[]) {
        int a, b;
        int result;
        a=10;
        b= 0;

        try {
            result = a / b;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("Invalid divisor value, b should not be 0.");
            e.printStackTrace();
        }
    } 
}
