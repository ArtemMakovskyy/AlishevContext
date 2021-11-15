package ar.mak.ConfigOnlyAnno2;

import ar.mak.Music;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}