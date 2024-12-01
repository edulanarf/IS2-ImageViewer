package ulpgc.es.imageviewer.swing;


import ulpgc.es.imageviewer.Image;

public interface ImageDisplay {
    void show(Image image);
    Image image();
}