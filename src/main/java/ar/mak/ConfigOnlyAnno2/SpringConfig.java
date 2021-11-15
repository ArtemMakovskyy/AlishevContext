package ar.mak.ConfigOnlyAnno2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ar.mak.ConfigOnlyAnno2")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}