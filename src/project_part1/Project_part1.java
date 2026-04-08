/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_part1;
import java.util.Scanner;

/**
 *
 * @author User
 */
class Login{
    boolean checkpin(String pin){
        String name;
        int password;
        int cell_phone_number ;
     for (password = 0; password <= 10; password ++) {
            System.out.println(password);
     }     
}
public class Project_part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = null;
        int password;
        int cell_number;
       int length =name.length();
        
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String Name = scan.nextLine();
        System.out.println("Enter password");
        int Password = scan.nextInt();
         System.out.println("Enter your cell phone number");
         int Cell_Number = scan.nextInt();
        
                
                
        // TODO code application logic here
    }
    
}
