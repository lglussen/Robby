/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.input;

import java.awt.AWTException;
import java.awt.Robot;
import org.openide.util.Exceptions;

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
}
