package it.nextre.academy.nxtlearn.config;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Logger getLogger(){
        return LoggerFactory.getLogger("nxtlearn");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}//end class

