package tv.buttons;

import tv.RemoteController;

public class On implements Button {

    RemoteController remoteController;

    public On(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    @Override
    public void push() {
        remoteController.switchOnOff(!remoteController.currentOnOff());
    }
}
