package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class ImageUtils {

    public static int imgCount = 0;


    public static BufferedImage getScreenShot(int x, int y, int width, int height){
        BufferedImage bfImg = null;

        try{
            Robot robot = new Robot();
            bfImg = robot.createScreenCapture(new Rectangle(x,y,width,height));
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return bfImg;
    }

    public static void saveImgAsFile(BufferedImage bfImg, String savePath, String fileName, String format){
        try {

            File path = new File(savePath);
            File file = new File(path, fileName + "." + format);
            imgCount++;
            ImageIO.write(bfImg, format, file);
        }catch (Exception e){

            System.out.println(e.toString());
        }
    }




}
