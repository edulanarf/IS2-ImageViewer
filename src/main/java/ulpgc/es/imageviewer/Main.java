package ulpgc.es.imageviewer;

import ulpgc.es.imageviewer.swing.MainFrame;

import java.io.File;

public class Main {
    public static final String root = "src/main/java/images";
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.imageDisplay().show(new FileImageLoader(new File(root)).load());
        frame.add("<", new PreviousImageCommand(frame.imageDisplay()));
        frame.add(">", new NextImageCommand(frame.imageDisplay()));
        frame.setVisible(true);
    }
}
