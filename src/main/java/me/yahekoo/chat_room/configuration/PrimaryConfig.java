package me.yahekoo.chat_room.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import java.util.logging.Filter;

@Configuration
public class PrimaryConfig {
/*
    @Bean
    public Filter prePostLoggingFilter() {
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
            filter.setIncludeQueryString(true);
            filter.setIncludePayload(true);
            filter.setMaxPayloadLength(5120);
        return (Filter) filter;
        }

 */
}
