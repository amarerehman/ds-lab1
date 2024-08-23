/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dtask3;


public class Dtask3 {

    
    public static void main(String[] args) {
       int[] arr=new int[6];
        arr[0]=100;
        arr[1]=200;
         arr[2]=300;
          arr[3]=400;
           arr[4]=500;   
          
           System.out.println("before insertion ");
           for(int i=0; i<arr.length; i++){
               System.out.println("Element at index "+i+" "+arr[i]);
           }
            int newelement=250;
           for(int i=arr.length-1; i>0;i--){
               arr[i]=arr[i-1];
           }
          arr[2]=newelement;  
         System.out.println(" after insertion ");
           for(int i=0; i<arr.length; i++){
             
               System.out.println("Element at index "+i+" "+arr[i]);
           }
    }
    
}
