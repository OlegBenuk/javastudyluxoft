package tv.buttons;

import tv.RemoteController;
import tv.TV;

public class ChannelPlus implements Button {

    RemoteController remoteController;

    public ChannelPlus(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void push() {
        int currentChannel = remoteController.currentChannel();
        if(currentChannel==TV.NUMBER_OF_CHANNELS){
            remoteController.changeChannel(0);
        }
        remoteController.changeChannel(currentChannel+1);
    }
}
