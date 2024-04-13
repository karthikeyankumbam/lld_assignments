package com.practice.Assignments.lld2.day138prototypeandregistry.user;

public class User implements ClonableObject<User>{
    private long userId;

    private String username;
    private String email;
    private String displayName;
    private int age;
    private UserType type;

    public User(long userId, String username, String email, String displayName, int age, UserType type) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.displayName = displayName;
        this.age = age;
        this.type = type;
    }
    private User(User org){
        this.userId = org.userId;
        this.username = org.username;
        this.email = org.email;
        this.displayName = org.displayName;
        this.age = org.age;
        this.type = org.type;
    }
    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }

    public UserType getType() {
        return type;
    }

    @Override
    public User cloneObject() {
        return new User(this);
    }
}
