package com.example.democab.config;

import com.example.democab.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public static final String CAB_LOCATION = "cab-location";

    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(AppConstant.CAB_LOCATION)
                .build();
    }
}
