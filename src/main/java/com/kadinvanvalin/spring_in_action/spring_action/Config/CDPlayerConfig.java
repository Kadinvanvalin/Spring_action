package com.kadinvanvalin.spring_in_action.spring_action.Config;
import com.kadinvanvalin.spring_in_action.spring_action.soundsystem.CDPlayer;
import com.kadinvanvalin.spring_in_action.spring_action.soundsystem.CompactDisc;
import com.kadinvanvalin.spring_in_action.spring_action.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}


