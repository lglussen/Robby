/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core;

import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        Controller.getInstance();
    }
}
