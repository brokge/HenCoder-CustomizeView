package com.hencoder.hencoderpracticedraw1;

/**
 * Created by chenlinwei on 2017/10/23.
 */

public class Data {

    private String name;
    private float  number;
    private int    color;

    public Data (String title, float f, int colorInt) {
        this.name = title;
        this.number = f;
        this.color = colorInt;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public float getNumber () {
        return number;
    }

    public void setNumber (float number) {
        this.number = number;
    }

    public int getColor () {
        return color;
    }

    public void setColor (int color) {
        this.color = color;
    }
}
