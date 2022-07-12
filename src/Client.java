import java.rmi.*;
import java.util.*;
public class Client {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInsira a quantidade de passos: ");
        int steps = sc.nextInt();
        double result;

        PICalculatorInterface piCalculator = (PICalculatorInterface)Naming.lookup("PICalc");
        result = piCalculator.calculator(steps);

        System.out.println("Valor aproximado de PI em "+steps+" passos é: "+result+"\n");
    }
}
