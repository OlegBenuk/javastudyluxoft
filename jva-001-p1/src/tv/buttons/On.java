package tv.buttons;

import tv.Button;
import tv.RemoteController;
import tv.TV;

public class On implements Button {
    @Override
    public void push(RemoteController remoteController) {
        remoteController.switchOnOff(!remoteController.currentOnOff());
    }
}
