/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author yamik
 */
public class TaskManager {
    
      // Declarations

 private String ToDo;
private String Done;
private String Doing;

public void menu(String ToDo ,String Done, String Doing){
this.ToDo = ToDo;
this.Done = Done;
this.Doing = Doing;

}

// Method for option one from menu
public String ToDo(){
return ToDo;
}

// Method for option two from menu
public String Done(){
return Done;
}
// Method for option one from menu
public String Doing(){
return Doing;
}

public static boolean checkTaskDescription(){
 /* Check if the task description is no longer then 50 characters*/
String taskDescription = null;

return taskDescription.length()<=50;

}
public static void createTaskID(){
TaskNumberGenerator generator = new TaskNumberGenerator();
         
int TaskNumber = generator.generateTaskNumber();

JOptionPane.showMessageDialog(null, "Task Number : #" + TaskNumber + 1); 

}

 public static void printTaskDetails(){
String printTaskDetails = "";
     String developerFirstName="";
     String developerLastName="";

JOptionPane.showMessageDialog(null, "Developer details:" + developerFirstName + "\n" + developerLastName + "developerLastName" + "Developer Details"+ JOptionPane.INFORMATION_MESSAGE);
}

 public static void returnTotalHours(){
int totalHours = 0;
     int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the task hours", "taskHours", JOptionPane.QUESTION_MESSAGE));
 
 //Add the Task hours
 totalHours += taskDuration;
 
}

 // Declarations

 private static int TaskIDOne;
private static int TaskIDTwo;

public void taskID(int TaskIDOne, int TaskIDTwo){
this.taskID(TaskIDOne, TaskIDTwo);

}

// Method fot task One Id

public int TaskIDOne(){
 return TaskIDOne ;
}


 // Method fot task Two Id

public int TaskIDTwo(){
return TaskIDTwo;

}

private static class generateTaskID {

        private static int generateRandomNumber(int i) {
           
            return 0;
           
        }


public generateTaskID() {
}
   
public static String generateTaskID(){
    
    String prefix = "AD";
    int taskNumber = generateRandomNumber(1000);
    String status = "INA";
    
    return prefix + ":"+ taskNumber + ":"+ status;
    
}
}
private static int generateRandomNumber(int max) {
   Random random = new Random();
  return random.nextInt(max);
}

    private static class TaskNumberGenerator {

        public TaskNumberGenerator() {
        }

        private int generateTaskNumber() {
            return 0;
        }
    }
}



   




    



