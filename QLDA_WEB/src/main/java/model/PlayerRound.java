package model;

public class PlayerRound {
    private User user;
    private int score;
    private int rank;
    private int choosedPosX;
    private int choosedPosY;

    public PlayerRound() {

    }

    public PlayerRound(User user, int score, int rank, int choosedPosX, int choosedPosY) {
        this.user = user;
        this.score = score;
        this.rank = rank;
        this.choosedPosX = choosedPosX;
        this.choosedPosY = choosedPosY;
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

    public int getChoosedPosX() {
        return choosedPosX;
    }

    public void setChoosedPosX(int choosedPosX) {
        this.choosedPosX = choosedPosX;
    }

    public int getChoosedPosY() {
        return choosedPosY;
    }

    public void setChoosedPosY(int choosedPosY) {
        this.choosedPosY = choosedPosY;
    }
}
