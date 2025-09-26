package com.example.indeed;

public class Rectangle extends Shape{
    private int width;
    private int height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x; //from Shape abstract class
        this.y = y; //"   "            " "
        //Set rectangle specific attribute
        this.width = width;
        this.height = height;
    }

}
