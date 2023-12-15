package main;

import java.awt.*;
import java.io.File;

public class Main {



    public static void main(String[] args) {
        String usrDir = System.getProperty("user.dir");
        usrDir += "\\imgRecord";
        System.out.println(usrDir);
//        BufferedImage bfImg = getScreenShot(-1920, 0, 1920, 1080);
//        saveImgAsFile(bfImg, usrDir, "hello", "png");

//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            System.out.println("input: " + scanner.nextLine());
//        }
        System.setProperty("savePath", usrDir);

        setImgCount(usrDir);

        Frame frame = new Frame("Demo");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        Label l = new Label();
        l.setText("a: 左邊螢幕截圖 \r\n s: 右邊螢幕截圖");
        frame.add(l);
        frame.setVisible(true);
        KeyListenerImpl keyListener = new KeyListenerImpl();
        frame.addKeyListener(keyListener);





    }


    public static void setImgCount(String dirPath){
        File path = new File(dirPath);
        if(path.isDirectory()){

            int filesCount = path.listFiles().length;
            ImageUtils.imgCount = filesCount;
        }
    }
}
