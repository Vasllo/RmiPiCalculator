import java.rmi.*;
import java.rmi.server.*;

public class PICalculator extends UnicastRemoteObject implements PICalculatorInterface {
    @Override
    public double calculator(int num_steps) throws RemoteException {
        double step = 0.0;
        double x = 0.0;
        double pi = 0.0;
        double sum = 0.0;

        step = 1.0/(double) num_steps;

        for (int i=0;i< num_steps; i++){
            x = (i + 0.5) * step; // Largura do retângulo
            sum += 4.0 / (1.0 + x*x); // Sum += Área do retângulo
        }

        pi = step * sum;
        return pi;
    }

    public PICalculator() throws RemoteException {
        super();
    }
}