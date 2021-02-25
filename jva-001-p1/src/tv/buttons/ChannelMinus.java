package tv.buttons;

import tv.Button;
import tv.RemoteController;
import tv.TV;

public class ChannelMinus implements Button {

    @Override
    public void push(RemoteController remoteController) {
        int currentChannel = remoteController.currentChannel();
        if(currentChannel==0){
            remoteController.changeChannel(TV.NUMBER_OF_CHANNELS);
        }
        remoteController.changeChannel(currentChannel-1);
    }
}
