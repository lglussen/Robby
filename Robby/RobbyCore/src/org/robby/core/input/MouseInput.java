/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.input;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openide.util.Exceptions;
import org.robby.core.util.TimeUtil;

/**
 *
 * @author Icer
 */
public class MouseInput {

    private static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            robot = null;
            Exceptions.printStackTrace(ex);
        }
    }

    private MouseInput() {
    }

    /*
     *   InputEvent button
     */
    public static synchronized void mousePress(int buttons) {
        robot.mousePress(buttons);
    }

    /*
     *   InputEvent button
     */
    public static synchronized void mouseRelease(int buttons) {
        robot.mouseRelease(buttons);
    }

    /*
     *   InputEvent button
     */
    public static synchronized void mouseClick(int button) {
        mousePress(button);
        TimeUtil.sleep(50);
        mouseRelease(button);
    }

    public static synchronized void mouseMove(int x, int y) {
        robot.mouseMove(x, y);
    }

    public static synchronized void mouseMoveAndClick(int x, int y, int button) {
        mouseMove(x, y);
        TimeUtil.sleep(50);
        mouseClick(button);
    }

    public static synchronized void mouseLeftClick() {
        mousePress(InputEvent.BUTTON1_DOWN_MASK);
        TimeUtil.sleep(50);
        mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
