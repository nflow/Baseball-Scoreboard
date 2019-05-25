package at.nwork;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        UdpScreen screen = new UdpScreen(28, 5, "192.168.1.112", 1337);
        int offset = screen.getWidth();
        BasicFont[] text =  BasicFont.createText("Phillies vs Brewers!");
        int totalLength = 0;
        for (BasicFont b: text) {
            totalLength += b.getWidth();
        }

        Color startColor = new Color(0, 0, 0);
        int faktor = 1;
        while (true) {
            screen.clear();
            for (int i = 0; i < screen.getWidth(); i++) {
                for (int j = 0; j < screen.getHeight(); j++) {
                    screen.setPixel(i,j, startColor);
                }
            }
            startColor.setRed(startColor.getRed() + faktor);
            //startColor.setBlue(startColor.getBlue() - faktor);
            if (startColor.getRed() > 10) {
                faktor = -1;
            } else if (startColor.getRed() <= 0) {
                faktor = 1;
            }
            int hoffset = offset;
            int voffset = 0;
            for (BasicFont c : text) {
                //BasicFont.setFontColor();
                BasicFont.setFontColor(new Color(50, 50, 50));
                for (Pixel p : c.getPixels()) {
                    if (p.getX() + hoffset >= 0 && p.getX() + hoffset < screen.getWidth() && p.getY() + voffset < screen.getHeight()) {
                        screen.setPixel(p.getX() + hoffset, p.getY() + voffset, p.getColor());
                    }
                }
                hoffset += c.getWidth() + 1;
            }
            screen.update();
            Thread.sleep(60);
            if (offset + totalLength + 10 < 0) {
                offset = screen.getWidth() + 10;
            } else {
                offset--;
            }
        }
    }
}
