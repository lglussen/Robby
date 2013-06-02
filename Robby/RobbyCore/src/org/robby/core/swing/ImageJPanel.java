/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.robby.core.swing;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Icer
 */
public class ImageJPanel extends JPanel {

    BufferedImage bi;

    public BufferedImage getBackgroundImage() {
        return bi;
    }

    public void setBackgroundImage(BufferedImage bi) {
        this.bi = bi;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (bi != null) {
            g.drawImage(bi, 0, 0, null);
        }
    }
}
