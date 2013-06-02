/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.input;

import java.awt.AWTException;
import java.awt.Robot;
import org.openide.util.Exceptions;
import org.robby.core.util.TimeUtil;

/**
 *
 * @author Icer
 */
public class KeyboardInput {
    
    private static Robot robot;
    
    static {
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            robot = null;
            Exceptions.printStackTrace(ex);
        }
    }
    
    private KeyboardInput() {
    }

    /*
     * KeyEvent keycode
     */
    public static synchronized void keyPress(int keycode) {
        robot.keyPress(keycode);
    }

    /*
     * KeyEvent keycode
     */
    public static synchronized void keyRelease(int keycode) {
        robot.keyRelease(keycode);
    }

    /*
     * KeyEvent keycode
     */
    public static void keyClick(int keycode) {
        keyPress(keycode);
        TimeUtil.sleep(20);
        keyRelease(keycode);
    }
}
