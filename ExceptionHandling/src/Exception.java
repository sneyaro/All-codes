import java.io.*;
public class Exception {
    public static void main(String[] args){
        int number1=5;
        int number2=0;
        try{
            System.out.println(number1/number2);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}
