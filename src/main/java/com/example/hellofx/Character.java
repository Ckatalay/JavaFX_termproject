package com.example.hellofx;

public class Character {
    private double  health;
    private double  posX;
    private double  posY;
    private int     score;
    private boolean isAlive;

    Character(double posX, double posY){
        this.health = 100;
        this.posX   = posX;
        this.posY   = posY;
        this.score  = 0;
        this.isAlive= true;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
