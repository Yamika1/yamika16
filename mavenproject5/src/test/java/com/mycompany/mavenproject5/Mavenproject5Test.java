/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yamik
 */
public class Mavenproject5Test {
    
   @Test

 public boolean testUsernamePass() {
       
        Message message = new Message();
        String Expected = "kyl_1";
        boolean Actual = message.stringMethod();
        assertEquals(Expected, Actual);
        return true;
    }

    // Check stringMethod --> Fail
    @Test
    public boolean testUsernameFail()
    {
        Message message = new Message();
        String Expected = "kyle!!!!!!!!!";
        boolean Actual = message.stringMethod();
        assertEquals(Expected, Actual);
            return false; 
    }

 @Test
    public void testUsernameValid()
    {
      Message message = new Message();
      boolean Expected = true;
      boolean Actual = message.CheckUserName();
      assertTrue(Actual);
      
    }
    
 @Test
    public boolean testValidUsernameFail()
    {
        Message message = new Message();
        boolean Expected = true;
        boolean Actual = message.CheckUserName();
        assertFalse(Actual);
         return false; 
    }

    
    
    @Test
    public boolean testPasswordPass()
    {
        Message message = new Message();
        String Expected = "Ch&&sec@99!";
        boolean Actual = message.stringMethod();
        assertEquals(Expected, Actual);
           return true; 

}

       @Test
    public boolean testPasswordFail()
    {
        Message message = new Message();
        String Expected = "password";
        boolean Actual = message.stringMethod();
        assertEquals(Expected, Actual);
         return false; 

}

@Test
    public boolean testPasswordValid()
    {
      Message message = new Message();
      boolean Expected = true;
      boolean Actual = message.Checkpassword();
      assertTrue(Actual);
             return true; 

    }
    
 @Test
    public boolean testPasswordInvaild()
    {
        Message message = new Message();
        boolean Expected = true;
        boolean Actual = message.Checkpassword();
        assertFalse(Actual);
               return false; 

    }


  @Test
public static void LoginSuccessful()
{
    boolean LoginSuccessful = true;

}


 @Test
public static void LoginFailed()
{
    boolean LoginFailed = false;

}

 @Test
public static void UsernameValid()
{
    boolean UsernameValid = true;

}

         @Test
public static void UsernameinValid()
{
    boolean UsernameinValid = false;

}
   
  @Test
public static void PasswordValid()
{
    boolean PasswordValid = false;

}   
    

     @Test
    public boolean testtaskDescription()
    {
        Message message = new Message();
            String Expected = "ThisIsATaskDescri";
        boolean Actual = message.checkTaskDescription();
        assertEquals(Expected,Actual);
           return true; 

        
    }

    @Test
     public boolean checkTaskDescription()
    {
        Message message = new Message();
            String Expected = "ThisIsATaskDescription";
        boolean Actual = message.checkTaskDescription();
        assertEquals(Expected,Actual);
              return false; 

        
    }
     
@Test
    public boolean testTaskDescriptionValid()
    {
      Message message = new Message();
      boolean Expected = true;
      boolean Actual = message.CheckTaskDescription();
      assertTrue(Actual);
             return true; 

    }
    
 @Test
    public boolean testTaskDescriptionInvaild()
    {
        Message message = new Message();
        boolean Expected = false;
        boolean Actual = message.CheckTaskDescription();
        assertFalse(Actual);
               return false; 

    }

    private static class Message {

        public Message() {
        }

        private boolean CheckTaskDescription() {
            
            return true;
            
        }

        private boolean checkTaskDescription() {
           
            return true;
           
        }
        private boolean Checkpassword() {
           
  return true;
           
        }
        private boolean stringMethod() {
            
   return true;
           
        }
        private boolean CheckUserName() {
           return true;
           
        }
    }

    
}
    
            
        
    
