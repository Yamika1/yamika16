/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yamik
 */
public class Mavenproject5 {

    public static void main(String[] args) {
       
 /*
Program to check the complexity of a userName:
 The userName must include an underscore and be no more than 5 characters long
Program to check the complexity of a password:   
The password is 8 characters long, password contains a capital letter,password contains a number, password contains a special character;
 */
         String Username = "";
String Password = "Password";
  String firstName = "";
        String lastName = "";
             
 
         JOptionPane.showInputDialog(null, "Please enter your first name", " firstName", JOptionPane.QUESTION_MESSAGE);
         JOptionPane.showInputDialog(null, "Please enter your last name", "lastName", JOptionPane.QUESTION_MESSAGE);
           String userName = JOptionPane.showInputDialog(null, "Please enter your Username", "userName", JOptionPane.QUESTION_MESSAGE);
         String password = JOptionPane.showInputDialog(null, "Please Enter you password", "password", JOptionPane.QUESTION_MESSAGE);
       
      if (Username.equals("Username")&& password.equals("password")){  
          
          JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that password is at least 8 characters, contains a number, contains a capital letter and a special character ", "unsuccessfullycapted", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that username contains an underscore and is at least 5 charcters long", "unsuccessfullyCaptured",JOptionPane.INFORMATION_MESSAGE);
 
   }else{  
    
          JOptionPane.showMessageDialog(null, "Username successfully captured", "successfullycaptured", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Password successfully captured", "successfullycaptured", JOptionPane.INFORMATION_MESSAGE);
       
      }
         registerUser(userName,password);
         loginUser(userName,password);
         returnLoginStatus();
    
        
        JFrame frame = new JFrame();
 
    
 TaskNumberGenerator generator = new TaskNumberGenerator();
         
int TaskNumber = generator.generateTaskNumber();

JOptionPane.showMessageDialog(null, "Task Number : #" + TaskNumber + 1); 

 TaskIDGenerator generato = new TaskIDGenerator();

      int taskID = generator.generatTaskID();
        String prefix = "AD";
        String taskNumber = "0";
        String status= "INA";
             
     JOptionPane.showMessageDialog(null,prefix + ":"+ taskNumber + ":"+ status); 
        
        

}

   
    public static void userDetails(){
          String password = "password";
         String Username = "userName";
          
        /* Check if the username contains an underscore and is no longer than 5 characters long */
  if (Username.contains("_") &&
              Username.length() <=5 &&
    password.matches(".*[@!#$*^%]*.") &&
password.matches(".'[1-10]'.")&&
password.matches(".'[A-Z].'") &&
 password.matches(".'[1-10]'.")&&
password.length() >= 8){
       
  

      }
    }
    @SuppressWarnings("empty-statement")
  public static void returnLoginStatus(){

    double totalHours =0;
    double taskDuration =0;
    int options =0;
    String selectedMenuOption = "";
    
       String userName = JOptionPane.showInputDialog(null, "Please enter your Username", "userName", JOptionPane.QUESTION_MESSAGE);
         String password = JOptionPane.showInputDialog(null, "Please Enter you password", "password", JOptionPane.QUESTION_MESSAGE);
       
    
    boolean LoginSuccessful = true;

if (LoginSuccessful){
JOptionPane.showMessageDialog(null, "A successful login", "successfulLogin", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null ,"Welcome user, it is great to see you again","Registration Successful", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showInputDialog(null, "Please enter your task name  : ", "tasks", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "tasks successfully captured: ", "taskscaptured", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "Welcome to Easykanban, Task successfully caputred.", "welcome", JOptionPane.INFORMATION_MESSAGE);
   JOptionPane.showInputDialog(null, "Please Enter Developer first name: ","firstName", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showInputDialog(null, "Please Enter Developer last name: ","lastName", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showInputDialog(null, "Please enter the name of your task:", "Add Login Feature", JOptionPane.QUESTION_MESSAGE);

String[] menuList = { "Add tasks ", "Show report", "Quit"};
    JOptionPane.showOptionDialog( null,"Select an option from numeric list:", "numericList",  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,menuList,menuList[0]);  
    int Choice = 0 ; 
      
    if (Choice >= 0 && Choice < menuList.length) {
            String menulist = menuList[Choice];
    
            JOptionPane.showMessageDialog( null, " Option selected from numeric list: " +  Choice,"Option Selected",JOptionPane.INFORMATION_MESSAGE  );    
     
            do{
            
     String[] menu = {"String ToDo" ,"String Done", "String Doing"};
JOptionPane.showOptionDialog(null, "Select a task:" , "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu,menu[0]);
           int choice = 0 ;

 if (choice >= 0 && choice < menu.length) {
String selectedOption = menu[choice];
 JOptionPane.showMessageDialog( null, "You selected a task: " + selectedOption, "Selected Task", JOptionPane.INFORMATION_MESSAGE );
if(selectedMenuOption.equals("Show Report")){
         JOptionPane.showMessageDialog(null, "Coming Soon","Coming Soon", JOptionPane.INFORMATION_MESSAGE);
        if(selectedMenuOption.equals("Quit")) {
         System.exit(0);
  }else{
       
 JOptionPane.showMessageDialog(null, "Please enter your task name of less than 50 characters : ", "tasks", JOptionPane.QUESTION_MESSAGE);
   taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the task hours", "taskHours", JOptionPane.QUESTION_MESSAGE));
 
 //Add the Task hours
 totalHours += taskDuration;
 
 options = JOptionPane.showConfirmDialog(null, "Do you want to add another task?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

}while (options == JOptionPane.YES_OPTION);
    
     // Display total hours hours
JOptionPane.showMessageDialog(null, "Total task hours: " + totalHours, "total hours", JOptionPane.INFORMATION_MESSAGE);
       
        int choices = 0;
         switch(selectedMenuOption){
             case "Add tasks":
    
                 addTasks();
             case"Show Report":
                 showReport();
             case"Quit":
                 System.exit(0);
                 break;

         }
        
         }
 }
          
 taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the task hours", "taskHours", JOptionPane.QUESTION_MESSAGE));
 
 //Add the Task hours
 totalHours += taskDuration;
 
 options = JOptionPane.showConfirmDialog(null, "Do you want to add another task?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

}while (options == JOptionPane.YES_OPTION);
    
     // Display total hours hours
JOptionPane.showMessageDialog(null, "Total task hours: " + totalHours, "total hours", JOptionPane.INFORMATION_MESSAGE);
       
        int choices = 0;
         switch(selectedMenuOption){
             case "Add tasks":
    
                 addTasks();
             case"Show Report":
                 showReport();
             case"Quit":
                 System.exit(0);
                 break;
         } 
         
              boolean LoginFailed = false;

      if(LoginFailed){
      JOptionPane.showMessageDialog(null, "A failed login", "failedLogin", JOptionPane.INFORMATION_MESSAGE); 
      JOptionPane.showMessageDialog(null,"Username or password incorrect, please try again", "incorrect username or password", JOptionPane.INFORMATION_MESSAGE);

      }
         }
    }
}

   

    private static void addTasks() {
    }
    private static void showReport() {
    }

    private static void registerUser(String userName, String password) {
    }
    private static void loginUser(String userName, String password) {
    }

    private static class TaskNumberGenerator {

        public TaskNumberGenerator() {
        }

        private int generateTaskNumber() {
            return 0;
        }

        private int generatTaskID() {
            return 0;
        }
    }

    private static class TaskIDGenerator {

        public TaskIDGenerator() {
        }
    }
}
   

   
       
     
            
            


  

   
         

            
            


            
        
            

    

  



  
     
        