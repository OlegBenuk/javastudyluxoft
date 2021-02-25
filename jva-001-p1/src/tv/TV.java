package tv;

public class TV {
    private boolean on;
    private int channel;
    private int volume;
    public static final int VOLUME_MAX = 100;
    public static final int VOLUME_MIN=0;
    public static final int NUMBER_OF_CHANNELS=100;

    public TV() {
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "TV{" +
                "on=" + on +
                ", channel=" + channel +
                ", volume=" + volume +
                '}';
    }
}
