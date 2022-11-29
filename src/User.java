public class User {
    private String userName;
    private double userId;
    private String fName;
    private String lName;
    //private String userPassword;
// the commented out password stuff will depend on if the program needs it

    public User(String userName, String userPassword, double userId, String fName, String lName) {
        this.userName = userName; // get username from user input
        //this.userPassword = userPassword; // get password from user input;
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
    }

    public User() {

    }

    public String getUserName() {
        return userName;
    }
    public void  setUserName(String userName) {
        this.userName = userName;
    }
    public double getUserId() {
        return userId;
    }
    public void setUserId(double userId) {
        this.userId = userId;
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


}
