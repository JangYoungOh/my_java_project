package ch01_variable_operator;

public class Add2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int z = 2*a + 3*b - c;

        System.out.println("result = 2*a + 3*b - c" + "=" + z );
        String result = "a : " + a ;
        result = result + "\nb : " + b ;
        result = result + "\nc : " + c ;
        result = result + "\nreuslt : " +  z ;
        System.out.println(result);
    }}
