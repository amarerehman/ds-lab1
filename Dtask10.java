/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dtask10;

/**
 *
 * @author ESHOP
 */
import java.util.Scanner;
public class Dtask10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       int[] arr=new int[5];
       for(int i=0; i<arr.length; i++){
           arr[i]=input.nextInt();
       }
       int[] arr2=new int[5];
       for(int i=arr.length-1,j=0; i>=0; i--,j++){
          arr2[j]=arr[i];
       }
       for(int i=0;i<arr2.length; i++){
           System.out.println(arr2[i]);
       }
       
    }
    
}
