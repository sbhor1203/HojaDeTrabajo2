
import java.util.Scanner;

public class StApp {

    
    /** 
     * @param args
     * @author Samantha Bhor
     */
    public static void main(String[] args) {
        StackCal red = new StackCal(); // llamamos a la calculadora

       String operacion;

       Scanner ingreso = new Scanner(System.in);

        System.out.println("Bienvenido, Por favor ingrese la operación sin espacios, ");
        operacion = ingreso.nextLine();
        String data = red.CalcFinal(operacion);
        System.out.println("El resultado es: "+red.postfixcomprob(data));

        
        
      }
    
}
