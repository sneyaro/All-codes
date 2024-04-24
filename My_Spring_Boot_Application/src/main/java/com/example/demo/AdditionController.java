import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
@RestController
public class AdditionController {
    private final ServiceAddition serviceAddition;

    @Autowired
    public AdditionController(ServiceAddition serviceAddition) {
        this.serviceAddition = serviceAddition;
    }

    @PostMapping("/add")
    public int addNumbers(@RequestBody AddRequest request) {
    	int number1= request.getnumber1();
    	int number2= request.getnumber2();
        return serviceAddition.addNumbers(number1 , number2);
    }
}
@Service
class ServiceAddition {
    public int addNumbers(int number1, int number2) {
        return number1 + number2;
    }
}

class AddRequest {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}

   
