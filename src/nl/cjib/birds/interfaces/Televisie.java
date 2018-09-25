package nl.cjib.birds.interfaces;

public interface Televisie {

    public static final int RESOLUTION = 1920;

    void on();

    void off();

    int switchChannel(int newChannel);

    public abstract int setVolume(int volume);

    public abstract int getCurrentChannel();
}
