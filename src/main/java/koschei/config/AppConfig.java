package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public Egg6 getEgg(Needle7 needle7) {
        return new Egg6(needle7);
    }

    @Bean
    public Needle7 getNeedle7(Deth8 deth8) {
        return new Needle7(deth8);
    }


}
