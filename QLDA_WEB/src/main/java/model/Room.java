package model;

import java.util.List;

public class Room {
    private int id;
    private int idWinner;
    private int numOfRound;
    private int timePerRound;
    private int maxPlayer;
    private int totalPlayer;
    private int totalTime;
    private int highestScore;
    private int status;
    private List<User> players;
    private List<Round> rounds;

    public Room() {

    }

    public Room(int id, int idWinner, int numOfRound, int timePerRound, int maxPlayer, int totalPlayer, int totalTime, int highestScore, int status, List<User> players, List<Round> rounds) {
        this.id = id;
        this.idWinner = idWinner;
        this.numOfRound = numOfRound;
        this.timePerRound = timePerRound;
        this.maxPlayer = maxPlayer;
        this.totalPlayer = totalPlayer;
        this.totalTime = totalTime;
        this.highestScore = highestScore;
        this.status = status;
        this.players = players;
        this.rounds = rounds;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public List<User> getPlayers() {
        return players;
    }

    public void setPlayers(List<User> players) {
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdWinner() {
        return idWinner;
    }

    public void setIdWinner(int idWinner) {
        this.idWinner = idWinner;
    }

    public int getNumOfRound() {
        return numOfRound;
    }

    public void setNumOfRound(int numOfRound) {
        this.numOfRound = numOfRound;
    }

    public int getTimePerRound() {
        return timePerRound;
    }

    public void setTimePerRound(int timePerRound) {
        this.timePerRound = timePerRound;
    }

    public int getMaxPlayer() {
        return maxPlayer;
    }

    public void setMaxPlayer(int maxPlayer) {
        this.maxPlayer = maxPlayer;
    }

    public int getTotalPlayer() {
        return totalPlayer;
    }

    public void setTotalPlayer(int totalPlayer) {
        this.totalPlayer = totalPlayer;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
