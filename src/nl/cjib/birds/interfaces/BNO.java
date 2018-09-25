package nl.cjib.birds.interfaces;

public class BNO implements Televisie /*, Iterable, Serializable, List, Comparable */ {

    private boolean on;
    private int currentChannel;
    private int currentVolume;

    @Override
    public void on() {
        this.on=true;

    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int switchChannel(int newChannel) {
       this.currentChannel = newChannel;

       return this.currentChannel;
    }

    @Override
    public int setVolume(int volume) {
        this.currentVolume = volume;

        return this.currentVolume;
    }

    @Override
    public int getCurrentChannel(){
        return this.currentChannel;
    }
}
