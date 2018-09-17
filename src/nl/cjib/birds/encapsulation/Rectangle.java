package nl.cjib.birds.encapsulation;

/**
 * This is a rectange with constraints: width: 3xheight
 */
public class Rectangle {

    private static final int RATIO = 3;

    private int height;

    public Rectangle(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.height * RATIO;
    }

    public void setWidth(int width) {
        this.height = width / RATIO;
    }
}
