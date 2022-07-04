
package poe;
import javax.swing.*;
import java.util.Scanner;


public class Worker
{
    final static int MAX_USERS = 5;
    final static int MAX_TASKS = 10;
    static int usersRegistered = 0; //Keeps track of Registered users
    private int loggedInUser = 0; // records successful login
    
    public int printLoginMenu()
    {
        int selection = 0;
        boolean valid = false;
        String userInput;
        
        
        
        while (!valid)
        {
            
            userInput = JOptionPane.showInputDialog(null, """
                                                          \t1. Register: 
                                                          \t2. Login user: 
                                                          \t3. Quit 
                                                          """,
                    "Login or Register",
                    JOptionPane.QUESTION_MESSAGE);
            
            /*if(checkIfAlphanumeric(userInput))
            {
                JOptionPane.showMessageDialog(null, "Invalid input");
                System.exit(0);
            }*/
            if((userInput == null) || (userInput.isEmpty()))
            {
                selection = 3;
                
            }
                
            else 
            {
                selection = Integer.parseInt(userInput);
            }
            if((selection < 1) || (selection > 3))
            {
                JOptionPane.showMessageDialog(null, "Invalid input", "Error Detected", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                valid = true;
            }
            
        
        }return selection;
    }
    
   /* public boolean checkIfAlphanumeric(String userInput)
    {
        boolean valid = false;
        for(int counter = 0; counter < userInput.length(); counter++)
        {
            if(Character.isLetter(userInput.charAt(counter)))
            {
                valid = true;
                
            }
        }return valid;
            
        
    } */
    public void registerUser(Login[] users )
    {
        int selection = 0;
        
        Scanner input = new Scanner(System.in);
        String userString = "";
        Login candidate = new Login();
        boolean valid = false;
        
        
        System.out.println("---------------");
        valid = false;
        
        do
        {
            
        
        System.out.print("Enter wanted Username[max 5 char + _]:");
        userString = input.next();
        if(candidate.checkUserName(userString))
        {
            valid = true;
        }
        else
        {
            System.out.println("Username is not correctly formatted, please ensure "
                    + "that your username contains an underscore "
                    + "and is no more than 5 characters in lengt");
        }
            
    }while(!valid);
        candidate.setUserName(userString);
        
        valid = false;
        do
        {
            
        
        System.out.print("Enter wanted Password min 8 char + _]:");
        userString = input.next();
        if(candidate.checkPasswordComplexity(userString))
        {
            valid = true;
        }
        else
        {
            System.out.println("Password is not correctly formatted, please ensure "
                    + "that the password contains at least 8 "
                    + "characters, a capital letter, a number and a special characte");
        }
            
    }while(!valid);
        candidate.setUserPassword(userString);
        
        System.out.print("Enter First Name : ");
        userString = input.next();
        candidate.setName(userString);
        
        System.out.print("Enter Last Name : ");
        userString = input.next();
        candidate.setSurname(userString);
        
        users[usersRegistered] = candidate;
        System.out.print("------------");
        System.out.println("User successfully reigstered");
        usersRegistered++;
        
        
        
        
        
        
        
            
        
    }
    
    
    public  boolean loginUser(Login[] users)
    {
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        String username, password;
        int index = 0;
        
        
        System.out.println("Username?");
        username = input.next();
        System.out.println("Password?");
        password = input.next();
        
        for (int counter = 0; counter < usersRegistered; counter ++)
        {
            if (users[counter].getUserName().equals(username))
            {
                if (users[counter].getUserPassword().equals(password))
                {
                    valid = true;
                    index = counter;
                    break;
                }
            }
        }if (valid)
        {
            JOptionPane.showMessageDialog(null," Welcome " + users[index].getName() + ","
             + users[index].getSurname() + "it is great to see you");
        }
        else 
        {
            System.out.println("Username or password incorrect, please try again");
        }
        
        return valid;
    }
    
    
        
        
        
    public void mainThread() 
    {
        int selection = 0;
        Login users[] = new Login[MAX_USERS];
        boolean valid = false;
        
        do
        {
            selection = printLoginMenu();
            switch (selection)
            {
                
            
                case 1: registerUser(users);
                         //registers a user
                        break;
                       
                case 2: 
                        loginUser((users));
                                
                         //login user
                         break;
                default: 
                         valid = false;
                    
            }
            for (int counter = 0; counter < usersRegistered; counter++)
            {
                System.out.println(users[counter].getName());
            }
        }while(valid);
        System.out.println("Thanks for using the app");
        System.exit(0);
        
        
        Login login = new Login();
        
       //selection = printLoginMenu();
        
    }
}
        
            
            
            
            
                
            
            
                
            
                    
            
            
        
        
        
        
