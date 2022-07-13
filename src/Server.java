import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.*;
public class Server {
    public static void main(String[] args) throws Exception{
        PICalculator piCalculator = new PICalculator();
        Naming.bind("PICalc", piCalculator);
        System.out.println("O pai tá on");
    }
}