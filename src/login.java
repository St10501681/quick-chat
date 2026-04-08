/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class login {
    //check if username contains 5 characters and an underscore
    public static boolean checkUsername(String username){
        return username.length()<=5 && username.contains("_");
    }
    
    //check if password contains 8 characters,has a capital latter,a digit and a special character
    public static boolean checkPassword(String password){
        if(password.length()<8) return false;
        
       
        
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        
        for(char ch :password.toCharArray()){
            if(Character.isUpperCase(ch))hasUpper=true;
            if(Character.isDigit(ch))hasDigit=true;
            if(Character.isSpaceChar(ch))hasSpecial=true;
           
        }
        return hasUpper && hasDigit && hasSpecial;
    }
    //check for special character
    private static boolean isSpecialCharacter(char ch){
        String specialChars ="!@#$%^&*()_+-={}[]:;\",<>./?";
                return specialChars.indexOf(ch)>0;
    }
    //check if cellphone number has '27'and has 11 Digits
    public static boolean checkCellphone(String cellphone_number){
        return cellphone_number.matches("27\\d{9}");
    }
}
