/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

import javax.swing.JOptionPane;

/**
 *
 * @author yamik
 */
public class LOGIN {


public static boolean checkUsernameComplexityandPasswordComplexity(){
       String Username = "userName";
        String password = "password";
        return Username.contains("_") && 
                 Username.length() <=5&&
password.matches(".*[@!#$*^%]*.") &&
        /* Check if password is at least 8 characters long*/
         password.length() >= 8 &&
         /*Check if password contains a capital letter*/
        password.matches(".'[A-Z].'") &&
        /* Check if password contains a number */
        password.matches(".'[0-9]'.") ;
         
}


 


public static void returnLoginStatus(){

       
        
 boolean LoginSuccessful = true;

if (LoginSuccessful){
JOptionPane.showMessageDialog(null, "A successful login", "successfulLogin", JOptionPane.INFORMATION_MESSAGE);
          
} else {
JOptionPane.showMessageDialog(null, "A failed login", "failedLogin", JOptionPane.INFORMATION_MESSAGE);


}
  
}

public static void registerUser(){
String Username = "Username";
String password = "Password";

if (Username.equals(Username) && password.equals(password)){
         JOptionPane.showMessageDialog(null, "Username successfully caputred." ); 
         JOptionPane.showMessageDialog(null, "Password successfully caputred."  ); 

}else{
      JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that username contains an underscore and is no more than 5 characters in length");  
       JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that password is at least 8 characters, contains a number, contains a capital letter and a special character "); 
  
}
} 


 public static boolean loginUser(){
  String Username = "kyl_10";
        String password = "Ch&&she@123#";
         
       if (Username.equals("kyl_10") && password.equals("Ch&&she@123#") ) {
        JOptionPane.showMessageDialog(null, "The two above conditions have been met and the user has been registered successfully" );
           }else{
        JOptionPane.showMessageDialog(null, "The password does not meet complexity requirements"  );  
         JOptionPane.showMessageDialog(null,   "The Username is incorrectly formatted ");
}
     return true;
}

    
    
   public static void registerUser(String userName, String password) {
    }

    public static void loginUser(String userName, String password) {
   }
 

    public static boolean complexityCheck(String Password) {
        
       return true;
        
    }

    public static boolean checkComplexity(String Username) {
         return true;
    }

    public static boolean checkPasswordComplexity() {
       return true; 
    }

}
