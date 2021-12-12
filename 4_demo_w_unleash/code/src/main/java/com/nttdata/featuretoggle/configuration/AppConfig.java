package com.nttdata.featuretoggle.configuration;


import io.getunleash.DefaultUnleash;
import io.getunleash.Unleash;
import io.getunleash.util.UnleashConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Value( "${unleash.appName}" )
    private String unleashAppName;
    @Value( "${unleash.apiUrl}" )
    private String unleashAPI;
    @Value( "${unleash.token}" )
    private String unleashToken;


    @Bean
    public Unleash unleashClient() {
        UnleashConfig config = UnleashConfig.builder()
                .appName(unleashAppName)
                .instanceId(unleashAppName.concat(String.valueOf(Math.random())))
                .unleashAPI(unleashAPI)
                .customHttpHeader("Authorization", unleashToken)
                .build();

        return new DefaultUnleash(config);
    }
}