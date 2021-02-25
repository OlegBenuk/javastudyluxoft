package tv;

public class RemoteController {
    TV tv;

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void changeChannel(int channel){
        tv.setChannel(channel);
    }

    public void changeVolume(int volume){
        if(tv.isOn()){
        tv.setVolume(volume);}
    }

    public void switchOnOff(boolean on){
        tv.setOn(on);
    }

    public int currentChannel(){
        return tv.getChannel();
    }

    public int currentVolume(){
        return tv.getVolume();
    }

    public boolean currentOnOff(){
        return tv.isOn();
    }

}
