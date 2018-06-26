package enggaarden.app.models.Entities;

public class User
{
    /*
    Fields
     */
    private String username;
    private String userPassword;
    private String userType;


    /*
    Constructors
     */
    public User()
    {}
    public User(String username, String userPassword, String userType)
    {
        this.username = username;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    /*
    Getters
     */
    public String getUsername()
    {
        return this.username;
    }
    public String getUserPassword()
    {
        return userPassword;
    }
    public String getUserType()
    {
        return userType;
    }

    /*
    Setters
     */
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }
    public void setUserType(String userType)
    {
        this.userType = userType;
    }
}