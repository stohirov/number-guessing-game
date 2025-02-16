package org.example;

public class User {

    private String firstName;
    private String lastName;
    private String username;
    private double winningPercentage;
    private int numberOfTotalGames;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getWinningPercentage() {
        return winningPercentage;
    }

    public void setWinningPercentage(double winningPercentage) {
        this.winningPercentage = winningPercentage;
    }

    public int getNumberOfTotalGames() {
        return numberOfTotalGames;
    }

    public void setNumberOfTotalGames(int numberOfTotalGames) {
        this.numberOfTotalGames = numberOfTotalGames;
    }
}
