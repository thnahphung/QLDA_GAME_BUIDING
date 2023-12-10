package model;

public class PlayerRoom {
    private User user;
    private int score;
    private int rank;
    private int status;

    public PlayerRoom() {

    }

    public PlayerRoom(User user, int score, int rank, int status) {
        this.user = user;
        this.score = score;
        this.rank = rank;
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
