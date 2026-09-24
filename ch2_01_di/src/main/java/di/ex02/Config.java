package di.ex02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public SonySpeaker sony() {return new SonySpeaker();}

    @Bean
    public AppleSpeaker apple() {return new AppleSpeaker();}

    @Bean
    SamsungTV tv2()  {return new SamsungTV();}

    @Bean
    SamsungTV tv() {return new SamsungTV(sony(), "75인치 QLED");}

    @Bean
    LgTV lgtv() {
        LgTV lgtv = new LgTV();
        lgtv.setSpeaker(apple());
        lgtv.setModel("75인치 QLED");
        return lgtv;
    }
}
