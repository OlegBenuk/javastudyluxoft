package tv.buttons;

import tv.Button;
import tv.RemoteController;
import tv.TV;

public class ChannelPlus implements Button {

    @Override
    public void push(RemoteController remoteController) {
        int currentChannel = remoteController.currentChannel();
        if(currentChannel==TV.NUMBER_OF_CHANNELS){
            remoteController.changeChannel(0);
        }
        remoteController.changeChannel(currentChannel+1);
    }
}
