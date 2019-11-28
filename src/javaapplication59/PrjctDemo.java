/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;
import java.util.*;
/**
 *
 * @author timothyblajsa
 */
public class PrjctDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     Prjct p = new Prjct();
     
     System.out.println("Enter the number of area codes: ");//input number of area 
     int numAreas = keyboard.nextInt();
     
     int[] Areas = new int[numAreas];//new array
     
     System.out.println("Enter the area codes: ");//input the actual elements
     for(int i =0; i<numAreas; i++){
         Areas[i] = keyboard.nextInt();
         System.out.println();
         
     System.out.println("Area Code: " + Areas[i]);//print array
     
     String zone = p.getZone(Areas);//zone is initialized by calling the getZone method and passing Areas through it
     
     System.out.println("Zone: " + zone);//print the zone
     System.out.println("Possible City/County: " + p.getCity(zone));//print the city/county
     System.out.println();
     
    }
     
}    
}



    
    

