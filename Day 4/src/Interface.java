
interface interfaces{
    final int number=10;

    void display();
}
public class Interface implements interfaces {
    public void display() {
        System.out.println("Printing");
    }
        public static void main(String[] args){
          Interface object = new Interface();
          object.display();
          System.out.println(number);
        }
    }


