/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mortgage_payment;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Mortgage_Payment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);//taking input from user
         int principal = 0;
//passing the input into the prinical variable
        double annual_Interest;
         
        while(true){
        System.out.print("Please enter Your Mortgage Loan:");//input the mortgage loan 
        principal = input.nextInt();//passing the input into the prinical variable
            if  (principal >= 1000 && principal <=1_000_000)
                break;
            System.out.print("enter a value between 1000 and 1,000,000");
            
           
        }
        
        while(true){
        //Annual Interest Input
        System.out.print("Please enter Interest Rate:");
        annual_Interest=input.nextDouble();
        
            if(annual_Interest>=0 && annual_Interest<=30)
                break;
            System.out.print("Enter Number greater than 0 and less than 30");
        }
        
        
        //Period In Years Input
        System.out.print("Please enter the Period In Years:");
        int period=input.nextInt();
        
        //Converting annunal rate to monthly
        double monthly_rate= (annual_Interest/100)/ 12;
        
        //Number of total Payments
        int total_payment=period*12;
        
        //numerator of mortgage
        double numerator= monthly_rate*Math.pow((1+monthly_rate),total_payment);
        
        //denomenator of mortgage
        double denomenator= Math.pow((1+monthly_rate),total_payment)-1;
        
        double mortgage= principal*(numerator/denomenator);
       
      
      
        NumberFormat dollarformat =NumberFormat.getCurrencyInstance();
        System.out.print( "Your Mortgage :"+ dollarformat.format(mortgage));
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
