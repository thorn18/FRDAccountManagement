package entities;

public abstract class User {

    private int userID;
    private String username;
    private String password;

    public User(int userId, String username, String password) {
        this.userID=userId;
        this.username=username;
        this.password = password;
    }
}
