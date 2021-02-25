package tv.buttons;

import tv.Button;
import tv.ButtonWithChannel;
import tv.RemoteController;
import tv.TV;

public class ChannelNumber implements ButtonWithChannel {
    int channelNumber;
    RemoteController remoteController;

    public ChannelNumber() {
    }

    public ChannelNumber(int channelNumber, RemoteController remoteController) {
        this.channelNumber = channelNumber;
        this.remoteController = remoteController;
    }

    @Override
    public void push() {
        remoteController.changeChannel(channelNumber);
    }

    @Override
    public void pickChannel(int channelNumber) {
        this.channelNumber = channelNumber;
    }
}
