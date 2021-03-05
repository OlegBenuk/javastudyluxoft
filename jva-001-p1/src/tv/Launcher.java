package tv;

import tv.buttons.Button;
import tv.buttons.ChannelNumber;
import tv.buttons.On;
import tv.buttons.VolPlus;

public class Launcher {
    public static void main(String[] args) {
        TV tv = new TV();

        RemoteController remoteController = new RemoteController();
        remoteController.setTv(tv);

        System.out.println(tv);

        Button on = new On(remoteController);
        on.push();

        System.out.println(tv);

        Button channelTwo = new ChannelNumber(5,remoteController);
        channelTwo.push();

        System.out.println(tv);

        Button increaseVolume = new VolPlus(remoteController);
        increaseVolume.push();

        System.out.println(tv);

    }
}
