 class calculator{
    int num1;
    int num2;
    int result;
    public int add(int num1, int num2)
    {

        result = num1+num2;
        return(result);
    }
}
public class obj {
    public static void main(String[] args) {
        int num1=4, num2=5;
        calculator calc = new calculator();
        int result =calc.add(num1=4,num2=5);
        System.out.println(result);
    }
}
