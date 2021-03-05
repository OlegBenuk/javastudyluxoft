package tv.buttons;

import tv.RemoteController;
import tv.TV;

public class VolPlus implements Button {

    RemoteController remoteController;

    public VolPlus(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void push() {
        int currentVolume = remoteController.currentVolume();
        if(currentVolume==TV.VOLUME_MAX){
            return;
        }
        remoteController.changeVolume(currentVolume+1);
    }
}
