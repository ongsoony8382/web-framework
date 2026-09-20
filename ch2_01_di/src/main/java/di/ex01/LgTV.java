package di.ex01;

public class LgTV implements TV {
    public void powerOn() {
        System.out.println("LG TV: PowerOn");
    }

    public void powerOff() {
        System.out.println("LG TV: PowerOff");
    }

    public void volumeUp() {
        System.out.println("LG TV: VolumeUp");
    }

    public void volumeDown() {
        System.out.println("LG TV: VolumeDown");
    }
}
