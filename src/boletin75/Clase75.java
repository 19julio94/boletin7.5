

package boletin75;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Clase75 {
    
    int num1,num2,num3;
    
    public int introduceNumero(){
       int num;
       String res=JOptionPane.showInputDialog("Dame o numero");
       num=Integer.parseInt(res);
      return num;
     
         }
    public void comparar(int num1,int num2,int num3){
        
       if(num1>num2&&num2>num3)
           JOptionPane.showMessageDialog(null, num1);
       else if(num2>num1&&num2>num3)
           JOptionPane.showMessageDialog(null, num2);
       else
           JOptionPane.showMessageDialog(null, num3);
               
                
    }    
    
    
}
