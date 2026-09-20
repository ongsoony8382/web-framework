package di.ex01;

public class SamsungTV implements TV {
    public void powerOn() {
        System.out.println("삼성 TV: PowerOn");
    }
    
    public void powerOff() {
        System.out.println("삼성 TV: PowerOff");
    }

    public void volumeUp() {
        System.out.println("삼성 TV: VolumeUp");
    }

    public void volumeDown() {
        System.out.println("삼성 TV: VolumeDown");
    }
}
