/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dtask2;

/**
 *
 * @author ESHOP
 */
public class Dtask2 {

    
    public static void main(String[] args) {
        int[] arr=new int[6];
        arr[0]=12;
        arr[1]=24;
         arr[2]=36;
          arr[3]=48;
           arr[4]=60;   
          
           System.out.println("before insertion ");
           for(int i=0; i<arr.length; i++){
               System.out.println("Element at index "+i+" "+arr[i]);
           }
            int newelement=6;
           for(int i=arr.length-1; i>0;i--){
               arr[i]=arr[i-1];
           }
          arr[0]=newelement;  
         System.out.println(" after insertion ");
           for(int i=0; i<arr.length; i++){
             
               System.out.println("Element at index "+i+" "+arr[i]);
           }
    }
}
