/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.screencapture;

import java.awt.image.BufferedImage;

/**
 *
 * @author Icer
 */
public interface ScreenshotListener {

    public void newScreenshot(BufferedImage screenshot, long timeFromLast);
}
