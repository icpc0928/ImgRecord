package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerImpl implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
//        System.out.println("Key typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Press: " + e.getKeyChar());
        String key = String.valueOf(e.getKeyChar());
        char c = key.toLowerCase().charAt(0);

        int x = 120;
        int y = 48;
        int width = 1920 - 120 -120;
        int height = 1080 - 48 - 48;
//        String path = System.getProperty("savePath");


        if(c == 'a'){
            //left screen
            x = -1920 + 120;
            saveImg(x, y, width, height);
        }else if (c == 's'){
            saveImg(x, y, width, height);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("Key Release: " + e.getKeyChar());
    }

    private void saveImg(int x, int y, int width, int height){
        var bfImg = ImageUtils.getScreenShot(x, y, width, height);
        ImageUtils.saveImgAsFile(bfImg, System.getProperty("savePath"), String.valueOf(ImageUtils.imgCount), "png");

    }
}
