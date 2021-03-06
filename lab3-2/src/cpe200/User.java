package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        /* your code here */
    }

    public boolean setUserName(String name)
    {
        String pattern="^([A-Za-z])([A-Za-z0-9]{7,})$";

        if(name.matches(pattern))
        {
            userName=name;
            return true;
        }
        else
        return false;
    }

    public boolean setPassword(String pass1)
    {
        String pass="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})$";

        if(pass1.matches(pass))
        {
            password=pass1;
            return true;

        } else
            return false;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }
}
