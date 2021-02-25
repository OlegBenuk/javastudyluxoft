package tv;

import tv.buttons.ChannelNumber;
import tv.buttons.On;
import tv.buttons.VolPlus;

public class Launcher {
    public static void main(String[] args) {
        TV tv = new TV();

        RemoteController remoteController = new RemoteController();
        remoteController.setTv(tv);

        System.out.println(tv);

        Button on = new On();
        on.push(remoteController);

        System.out.println(tv);

        ButtonWithChannel channelTwo = new ChannelNumber();
        channelTwo.pickChannel(2);
        channelTwo.push(remoteController);

        System.out.println(tv);

        Button increaseVolume = new VolPlus();
        increaseVolume.push(remoteController);

        System.out.println(tv);

    }
}
