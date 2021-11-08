package ar.mak.AnnoXML;

import ar.mak.Music;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
