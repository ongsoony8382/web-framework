package di.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVUser {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
        TV tv = (TV)factory.getBean("tv");

        TV lgtv = (TV)factory.getBean("lgtv");

        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();

        lgtv.powerOn();
        lgtv.powerOff();
        lgtv.volumeUp();
        lgtv.volumeDown();
    }
}
