package tv.buttons;

import tv.RemoteController;

public class ChannelNumber implements Button {
    int channelNumber;
    RemoteController remoteController;

    public ChannelNumber(int channelNumber, RemoteController remoteController) {
        this.channelNumber = channelNumber;
        this.remoteController = remoteController;
    }

    @Override
    public void push() {
        remoteController.changeChannel(channelNumber);
    }

}
