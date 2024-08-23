/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dtask5;

/**
 *
 * @author ESHOP
 */
public class Dtask5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arr=new int[6];
        arr[0]=8;
        arr[1]=16;
         arr[2]=24;
          arr[3]=32;
           arr[4]=40;   
          
           System.out.println("before deletion");
           for(int i=0; i<arr.length; i++){
               System.out.println("Element at index "+i+" "+arr[i]);
           }
            int deletindex=2;
           for(int i=deletindex; i<arr.length-1;i++){
               arr[i]=arr[i+1];
           }
          arr[arr.length-1]=0;  
         System.out.println(" after deletion ");
           for(int i=0; i<arr.length; i++){
             
               System.out.println("Element at index "+i+" "+arr[i]);
           }
    }
    
}
