/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.screencapture;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import org.openide.util.Exceptions;

/**
 *
 * @author Icer
 */
public class ScreenshotController {

    private static final ScreenshotController INSTANCE = new ScreenshotController();
    private List<ScreenshotListener> listeners;
    private Screenshot ss;
    private Thread captureThread;
    private volatile boolean capturing = false;
    private long lastTime = 0;

    private ScreenshotController() {
        listeners = new ArrayList<ScreenshotListener>();
        ss = ss = new Screenshot();
        captureThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (capturing) {
                        captureScreen();
                    } else {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Exceptions.printStackTrace(ex);
                        }
                    }
                }
            }
        };
        captureThread.start();
    }

    public static ScreenshotController getInstance() {
        return INSTANCE;
    }

    public void addScreenshotListener(ScreenshotListener listener) {
        listeners.add(listener);
    }

    public void removeScreenshotListener(ScreenshotListener listener) {
        listeners.remove(listener);
    }

    public void startCapturing() {
        lastTime = System.currentTimeMillis();
        capturing = true;
    }

    public void stopCapturing() {
        capturing = false;
    }

    public void captureScreen() {
        long time = System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();
        BufferedImage bi = ss.takeScreenshot();
        for (ScreenshotListener screenshotListener : listeners) {
            screenshotListener.newScreenshot(bi, time);
        }
    }

    public Rectangle getScreenshotDimensions() {
        return ss.getScreenshotDimensions();
    }

    public void setScreenshotDimensions(Rectangle ssRect) {
        ss.setScreenshotDimensions(ssRect);
    }
}
