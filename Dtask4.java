/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dtask4;

/**
 *
 * @author ESHOP
 */
public class Dtask4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arr=new int[6];
        arr[0]=3;
        arr[1]=6;
         arr[2]=9;
          arr[3]=12;
           arr[4]=15;   
          
           System.out.println("before insertion ");
           for(int i=0; i<arr.length; i++){
               System.out.println("Element at index "+i+" "+arr[i]);
           }
            int newelement=18;
           for(int i=arr.length-1; i>0;i--){
               arr[i]=arr[i-1];
           }
          arr[5]=newelement;  
         System.out.println(" after insertion ");
           for(int i=0; i<arr.length; i++){
             
               System.out.println("Element at index "+i+" "+arr[i]);
           }
    }
    
}
