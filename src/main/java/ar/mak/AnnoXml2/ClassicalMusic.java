package ar.mak.AnnoXml2;

import ar.mak.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
