/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.navigation;

/**
 *
 * @author Icer
 */
public class Navigation {

    private int currentX;
    private int CurrentY;
    
    private int deltaX;
    private int deltaY;
    
    private int[][] map;

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return CurrentY;
    }

    public void setCurrentY(int CurrentY) {
        this.CurrentY = CurrentY;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }
}
