

package boletin75;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin75 {


    public static void main(String[] args) {
      
        Clase75 obx=new Clase75();
        int num1;
        int num2;
        int num3;
        
        num1=obx.introduceNumero();
        num2=obx.introduceNumero();
        num3=obx.introduceNumero();
        
        obx.comparar(num1, num2, num3);
                
        
        
    }
    
}
