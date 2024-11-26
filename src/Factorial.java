import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Factorial {
    public int calculateFactorial(int n) throws Exception {
        
        if( n < 0){

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
