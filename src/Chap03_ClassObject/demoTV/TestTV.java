package Chap03_ClassObject.demoTV;

public class TestTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLever(4);
        System.out.println("Tv1: channel= " + tv1.getChannel() + " valumeLever= " + tv1.getVolumeLever());

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.volumeDown();
        tv2.volumeDown();
        tv2.channelUp();
        System.out.println("Tv2: channel= " + tv2.getChannel() + " valumeLever= " + tv2.getVolumeLever());
    }
}
