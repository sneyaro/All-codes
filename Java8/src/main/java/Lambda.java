@FunctionalInterface
interface interface1{
    void show(int number);
}

public class Lambda {
    public static void main(String[] args){
        interface1 object = (number) -> System.out.println("in show " + number);
        object.show(2);
    }
}
