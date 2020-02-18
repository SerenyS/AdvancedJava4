import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class Question8BigDecimal{
    public static void main(String[] args) {
        BigInteger wisconsin = new BigInteger("5726398") ;
        BigInteger california = new BigInteger("38041430");
        BigInteger texas = new BigInteger("26059203");
        BigDecimal costo= new BigDecimal("3.23");

        BigInteger WIandCA = new BigInteger(String.valueOf(wisconsin.multiply(california)));
        BigInteger Tejas = new BigInteger(String.valueOf(WIandCA.multiply(texas)));
        BigDecimal TejasDecimal = new BigDecimal(Tejas);
        BigDecimal cost = new BigDecimal(String.valueOf(costo.multiply(TejasDecimal)));

        DecimalFormat f = new DecimalFormat("###,###.##");

        System.out.println("The total cost of the copies $"+ (f.format(cost)));
    }
}
