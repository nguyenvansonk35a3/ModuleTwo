package Chap03_ClassObject.demoTV;

public class TV {

    private int channel = 1;
    private int volumeLever = 1;
    boolean on = false;

    TV() {
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLever() {
        return volumeLever;
    }

    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 120) {
            this.channel = channel;
        }
    }

    public void setVolumeLever(int volumeLever) {
        if (on && volumeLever >= 1 && volumeLever <= 7) {
            this.volumeLever = volumeLever;
        }
    }

    public void channelDown() {
        if (on && this.channel > 1) {
            this.channel--;
        }
    }

    public void channelUp() {
        if (on && this.channel < 120) {
            this.channel++;
        }
    }

    public void volumeUp() {
        if (on && this.volumeLever < 7) {
            this.volumeLever++;
        }
    }

    public void volumeDown() {
        if (on && this.volumeLever > 1) {
            this.volumeLever--;
        }
    }
}
