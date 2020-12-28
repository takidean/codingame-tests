import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Probabilite {

    public  static void main(String[]args){

        System.out.println(throwDices(10,6));
        //[Probability with 10 6-sided dice] expected:<0.[83849]> but was:<0.[00001]>
    }

    public static BigDecimal throwDices(int D, int F) {
        BigDecimal result =BigDecimal.valueOf(0,5);
    for(int i=1;i<=D;i++){
        Double denum=1*Math.pow((F-1),i-1);
        Double num=Math.pow(F,i);
        result=result.add(BigDecimal.valueOf( denum.longValue(),5)
                .divide(BigDecimal.valueOf( num.longValue(),5),5, RoundingMode.HALF_EVEN));
    }
       /*  int denum=(F*D)-(D-1);
         [Probability with 10 6-sided dice] expected:<0.838[49]> but was:<0.838[55]>
         System.out.println(denum);
        System.out.println(nummerator);
        BigDecimal result = BigDecimal.valueOf(denum,5).divide(nummerator,5, RoundingMode.UP);
    */
    return result;

    }

}
