/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.util;

import org.openide.util.Exceptions;

/**
 *
 * @author Icer
 */
public class TimeUtil {

    private TimeUtil() {
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
