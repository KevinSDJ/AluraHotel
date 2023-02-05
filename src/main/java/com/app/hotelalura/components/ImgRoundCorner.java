package com.app.hotelalura.components;

import javax.swing.Icon;
import javax.swing.JComponent;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;


public class ImgRoundCorner extends JComponent {
    
    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    private Icon icon;
    private int borderSize;

    @Override
    protected void paintComponent(Graphics grphcs) {
        
        if (icon != null) {
            int width =(int) getPreferredSize().getWidth();
            int height = (int) getPreferredSize().getHeight();
            int diameter = Math.min(width, height);
            int x = width / 2 - diameter / 2;
            int y = height / 2 - diameter / 2;
            int border = borderSize * 2;
            diameter -= border;
            Rectangle size = getAutoSize(icon, diameter);
            BufferedImage img = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2_img = img.createGraphics();
            g2_img.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2_img.fillRoundRect(0, 0, width, height, 20, 20);
            Composite composite = g2_img.getComposite();
            g2_img.setComposite(AlphaComposite.SrcIn);
            g2_img.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2_img.drawImage(toImage(icon), 0, 0, toImage(icon).getWidth(getFocusCycleRootAncestor()),height, null);
            g2_img.setComposite(composite);
            g2_img.dispose();
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           
            g2.drawImage(img, 0, 0, null);
        }
        super.paintComponent(grphcs);
    }

    private Rectangle getAutoSize(Icon image, int size) {
        int w = size;
        int h = size;
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        if (width < 1) {
            width = 1;
        }
        if (height < 1) {
            height = 1;
        }
        int cw = size;
        int ch = size;
        int x = (cw - width) / 2;
        int y = (ch - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }

}
