/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core;

import java.util.ArrayList;
import java.util.List;
import org.robby.core.navigation.Navigator;
import org.robby.core.plugins.RobbyPlugin;
import org.robby.core.screencapture.ScreenshotController;

/**
 *
 * @author Icer
 */
public class Controller {

    private static final Controller INSTANCE = new Controller();
    private Navigator navigator;
    List<RobbyPlugin> plugins = new ArrayList<RobbyPlugin>();

    private Controller() {
        ScreenshotController.getInstance().startCapturing();
    }

    public static Controller getInstance() {
        return INSTANCE;
    }

    public void registerPlugin(RobbyPlugin plugin) {
        plugins.add(plugin);
    }

    public void removePlugin(RobbyPlugin plugin) {
        plugins.remove(plugin);
    }
}
