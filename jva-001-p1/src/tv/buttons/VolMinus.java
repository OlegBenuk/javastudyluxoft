package tv.buttons;

import tv.RemoteController;
import tv.TV;

public class VolMinus implements Button {

    RemoteController remoteController;

    public VolMinus(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void push() {
        int currentVolume = remoteController.currentVolume();
        if(currentVolume==TV.VOLUME_MIN){
            return;
        }
        remoteController.changeVolume(currentVolume-1);
    }
}
