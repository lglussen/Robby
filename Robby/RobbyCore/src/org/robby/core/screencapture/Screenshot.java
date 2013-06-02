/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.screencapture;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Icer
 */
public class Screenshot {

    Robot robot;
    Rectangle ssRect;

    public Screenshot() {
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(Screenshot.class.getName()).log(Level.SEVERE, null, ex);
        }
        Dimension ssDim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        ssRect = new Rectangle(ssDim);
    }

    public Rectangle getScreenshotDimensions() {
        return ssRect;
    }

    public void setScreenshotDimensions(Rectangle ssRect) {
        this.ssRect = ssRect;
    }

    public BufferedImage takeScreenshot() {
        return robot.createScreenCapture(ssRect);
    }
}
