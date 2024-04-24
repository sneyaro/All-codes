
public class Exception1 {
    public static void main(String[] args){
        String string = null;
         int number1=8;
         int number2=0;
        try {
            System.out.println(number1 / number2);
        }
        catch(ArithmeticException e){
            System.out.println("can't divide by zero........"+e);
        }
        try{
            System.out.println(string.length());
        }
        catch(NullPointerException e){
            System.out.println("Something went wrong........... "+e);
        }

    }

}
