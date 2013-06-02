/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.WorldInformation;

/**
 *
 * @author Icer
 */
public class Place {

    private int x;
    private int y;
    private int w;
    private int h;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
