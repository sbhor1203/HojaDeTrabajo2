
import junit.framework.TestCase;
public class testProgram extends TestCase{

    public static void main(String[] args) {
        StackCal af = new StackCal();
        
        String op1 = af.CalcFinal("1 2 + 4 * 3 +");
        System.out.println("El resultado es: "+af.postfixcomprob(op1));
        
        String op2 = af.CalcFinal("2+3*4");
        System.out.println("El resultado es: "+af.postfixcomprob(op2));
      }

    
}
