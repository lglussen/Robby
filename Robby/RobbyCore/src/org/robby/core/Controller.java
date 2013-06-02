/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core;

import org.robby.core.screencapture.ScreenshotController;

/**
 *
 * @author Icer
 */
public class Controller {
    private static final Controller INSTANCE = new Controller();
    private Controller(){
        ScreenshotController.getInstance().startCapturing();
    }

    public static Controller getInstance() {
        return INSTANCE;
    }
}
