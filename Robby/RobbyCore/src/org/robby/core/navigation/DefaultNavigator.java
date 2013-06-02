/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.navigation;

import java.awt.image.BufferedImage;

/**
 *
 * @author Icer
 */
public class DefaultNavigator implements Navigator {

    int[][] map = new int[10][10];

    public DefaultNavigator() {
    }

    @Override
    public Navigation processImage(BufferedImage image) {
        Navigation nav = new Navigation();
        nav.setCurrentX(0);
        nav.setCurrentY(0);
        
        return nav;
    }
}
