package tv.buttons;

import tv.RemoteController;
import tv.TV;

public class ChannelMinus implements Button {

    RemoteController remoteController;

    public ChannelMinus(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void push() {
        int currentChannel = remoteController.currentChannel();
        if(currentChannel==0){
            remoteController.changeChannel(TV.NUMBER_OF_CHANNELS);
        }
        remoteController.changeChannel(currentChannel-1);
    }
}
