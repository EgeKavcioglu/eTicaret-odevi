package eTicaret.models;

public class User {

    private String userName;
    private int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }
    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = userName;
    }
    public int getAge() {
        return userAge;
    }

    public void setAge(int userAge) {
        this.userAge = userAge;
    }

}