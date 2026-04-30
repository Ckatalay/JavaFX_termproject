package com.example.hellofx;

public class VacuumBar {
    private double posX;
    private double posY;
    private double barPercentage;

    public VacuumBar(double posX, double posY, double barPercentage) {
        this.posX = posX;
        this.posY = posY;
        this.barPercentage = barPercentage;
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

    public double getBarPercentage() {
        return barPercentage;
    }

    public void setBarPercentage(double barPercentage) {
        this.barPercentage = barPercentage;
    }

    public double barHeight(double size){
        return size*this.getBarPercentage();
    }

}
