package it.nextre.academy.nxtlearn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//EnableWebMVC se attivato resetta la pre-configurazione di SpringBoot e sarà necessario specificare nuovamente tuttee le configurazioni del viewersolver e altro...
@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    //Override metodi per impostare tutte le possibili configurazioni di Spring WebMVC


}//end class
