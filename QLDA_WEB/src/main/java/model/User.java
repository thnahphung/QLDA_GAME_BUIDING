package model;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String linkAvatar;
    private int totalGames;
    private int totalWins;
    private List<User> friends;

    public User() {
    }

    public User(int id, String name, String email, String password, String linkAvatar, int totalGames, int totalWins, List<User> friends) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.linkAvatar = linkAvatar;
        this.totalGames = totalGames;
        this.totalWins = totalWins;
        this.friends = friends;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLinkAvatar() {
        return linkAvatar;
    }

    public void setLinkAvatar(String linkAvatar) {
        this.linkAvatar = linkAvatar;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }
}

