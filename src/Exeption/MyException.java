package exeption;



public class MyException {
    public static void main(String[] args) {
        MyException obj = new MyException();
        obj.myMethod1();
    }


    public void myMethod1() {
        try {
            myMethod2();
        }
        catch(ArithmeticException e){
            System.out.println("the number is not divisible by zero");
        }
    }


        public void myMethod2 () {
        int a = 10;
        int b = 0;
        int c = a / b;

    }

}
