
package poe;


public class Login
{
    
    private String name = "";
    private String surname = "";
    private String userName = "";
    private String userPassword = "";
    
    private final String underScore = "_";
    private final int Max_Username = 5;
    private final int MIN_PASSWORD = 8;
    private final String Special = " !@#$%^&*;:<>_+=-./?\\";
    
    public boolean checkIfSpecial(String Password)
    {
        boolean valid = false;
        for(int counter = 0; counter < Special.length(); counter++)
        {
            String check = Character.toString(Special.charAt(counter));
            
            if(Password.contains(check))
            {
                valid = true;
                break;
            }
        }
                
                
        return valid;        
    }
    
    public boolean checkIfDigit(String Password)
    {
        boolean valid = false;
        for(int counter = 0; counter < Password.length(); counter++)
        {
            if(Character.isDigit(Password.charAt(counter)))
            {
                valid = true;
                break;
            }
        }
        return valid;
    }
    
    public boolean checkIfUpper(String Password)
    {
        boolean valid = false;
        for(int counter = 0; counter < Password.length(); counter++)
        {
            if(Character.isUpperCase(Password.charAt(counter)))
            {
                valid = true;
                break;
            }
        }
        return valid;
    }
    
    public boolean checkPasswordComplexity(String Password)
    {
        boolean valid = false;
        
        if(checkIfEmpty(Password) && (Password.length() >= MIN_PASSWORD))
        {
            if(checkIfUpper(Password) && (checkIfDigit(Password)))
            {
                if(checkIfSpecial(Password))
                {
                    valid = true;
                }
            }
        } return valid;
    }
    
    public boolean checkUserName(String UserName)
    {
        boolean valid = false;
        
        if(checkIfEmpty(UserName))
        {
            if(UserName.length() <= Max_Username)
            {
                if(UserName.contains(underScore))
                {
                    valid =  true;
                }
            }
        }
        
        
        return valid;
    }
    
    public boolean checkIfEmpty(String UserName )
    {
        boolean valid = false;
        
        if((UserName != null) && (!UserName.isEmpty()))
        {
            valid =  true;
        }
        
        return true;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword()
    {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }
    
    
    
}
