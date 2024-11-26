import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Factorial {
    public int calculateFactorial(int n) throws Exception {
        
        try{
            if( n < 0){
                IOException a = new IOException("n can't be negative");
                throw(a);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        ArrayList<BigDecimal> FactorialList = new ArrayList();

        BigDecimal currentFactorial = BigDecimal.ONE;
        FactorialList.add(currentFactorial);

        for(int i = 1; i < n; i++){
            currentFactorial = currentFactorial.multiply(new BigDecimal(i));
            FactorialList.add(currentFactorial);
        }
        return n;
    }
}
