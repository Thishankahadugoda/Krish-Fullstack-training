
import java.math.BigDecimal;

public class BigDecimal{

    public static void main(String[] args) {

        System.out.println("------- Calculation with double-------");

        double d1 = 20.67;
        double d2 = 10.27;

        System.out.println(" d1 - d2 = "+ (d1-d2));


        System.out.println("------Calculation with BigDecimal------------");

        BigDecimal bd1 = new BigDecimal("20.67");
        BigDecimal bd2 = new BigDecimal("10.27");

        System.out.println(" bd1 - bd2 = "+(bd1.subtract(bd2)));

    }
}