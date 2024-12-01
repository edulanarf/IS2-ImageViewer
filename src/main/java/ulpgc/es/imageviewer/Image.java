package ulpgc.es.imageviewer;

public interface Image {
    String id();
    Image next();
    Image prev();
}
