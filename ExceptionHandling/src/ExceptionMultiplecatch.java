public class ExceptionMultiplecatch  {
    public static void main(String[] args) {
        try {

            String string = null;
            System.out.println(string.length());
            int result = 10 / 0;
        } catch (NullPointerException e) {

            System.out.println("NullPointerException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
