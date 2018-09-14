/*
 * Blake Hadaway
 * September 14th, 2018
 * To take the users first name, capitlize it, the take the sum, difference, product,
 * and quotent of two numbers inputed
 */

package nameandnum;
import javax.swing.*;
/**
 *
 * @author blhad3491
 */
public class NameAndNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int spacePos; 
        double num1, num2;
        String num1Str, num2Str;
        String nameStr,firstName, capName;
        
        
        
        nameStr = JOptionPane.showInputDialog("Please enter your full name.");
        num1Str = JOptionPane.showInputDialog("Please enter the bigger number.");
        num2Str = JOptionPane.showInputDialog("Please enter the smaller number.");
        
        
        spacePos = nameStr.indexOf(" "); //looking for a space
           firstName  = nameStr.substring(0,spacePos); //taking substring
           capName = firstName.toUpperCase();// making firsr name upper case
           
           num1 = Double.parseDouble(num1Str);
           num2 = Double.parseDouble(num2Str);
           
           System.out.println(capName);
           System.out.println("Sum = "+(num1+num2)); //sum
           System.out.println("Difference = "+(num1-num2)); //difference
           System.out.println("Product = "+(num1*num2)); //product
           System.out.println("Quotent = "+(num1/num2)); //quotent
        
            
    }   
    
}
