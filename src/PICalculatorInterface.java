import java.rmi.RemoteException;
import java.rmi.Remote;

public interface PICalculatorInterface extends Remote{
    public double calculator(int stepNumbers) throws RemoteException;
}