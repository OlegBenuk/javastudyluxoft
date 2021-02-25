package tv.buttons;

import tv.Button;
import tv.RemoteController;
import tv.TV;

public class VolMinus implements Button {
    @Override
    public void push(RemoteController remoteController) {
        int currentVolume = remoteController.currentVolume();
        if(currentVolume==TV.VOLUME_MIN){
            return;
        }
        remoteController.changeVolume(currentVolume-1);
    }
}
