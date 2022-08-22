package com.centit.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;

public class JavaConfig {
    @Bean("cmd")
    @Conditional(WindowsCondition.class)
    ShowCmd winCmd(){
    return new WindowsShowCmd();
    }

    @Bean("cmd")
    @Conditional(LinuxCondition.class)
    ShowCmd linuxCmd(){
    return new LinuxShowCmd();

    }
    @Bean("ds")
    @Profile("dev")
    DateSource devDataSource(){
        DateSource dateSource = new DateSource();
        dateSource.setUsername("root");
        dateSource.setPassword("123");
        dateSource.setUrl("jdbc:mysql://127.0.0.1:3306/dev");
        return dateSource;
    }
    @Bean("ds")
    @Profile("prod")
    DateSource prodDataSource(){
        DateSource dateSource = new DateSource();
        dateSource.setUsername("root");
        dateSource.setPassword("45343444");
        dateSource.setUrl("jdbc:mysql://198.167.137.1:3306/dev");
        return dateSource;
    }
}
