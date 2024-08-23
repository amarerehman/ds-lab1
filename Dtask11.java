/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dtask11;

/**
 *
 * @author ESHOP
 */
import java.util.Scanner;
public class Dtask11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int left=0;
        int right=str.length()-1;
        boolean palindrome=true;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                palindrome=false;
                
            }else{
                left++;
                right--;
            }
        }
            if(palindrome==true){
                System.out.println("String is palindrome");
            }else{
                System.out.println("String is not palindrome");
            }
        
    }
    
}
