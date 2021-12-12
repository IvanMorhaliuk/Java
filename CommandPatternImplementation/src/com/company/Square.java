package com.company;

public class Square {
    private int lengthOfSide;
    private int x;
    private int y;
    public Square(int x,int y,int l){
        this.x = x;
        this.y = y;
        this.lengthOfSide = l;
    }

    public int getLengthOfSide() {
        return lengthOfSide;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }
    @Override
    public String toString(){
        return  "Square x,y->" + this.x +","+this.y+" length of side->" + this.lengthOfSide;
    }
}
