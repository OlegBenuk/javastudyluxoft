package tv.buttons;

import tv.Button;
import tv.RemoteController;
import tv.TV;

public class VolPlus implements Button {
    @Override
    public void push(RemoteController remoteController) {
        int currentVolume = remoteController.currentVolume();
        if(currentVolume==TV.VOLUME_MAX){
            return;
        }
        remoteController.changeVolume(currentVolume+1);
    }
}
