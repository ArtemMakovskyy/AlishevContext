package ar.mak.AnnoXml2;

import ar.mak.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("music_Player")
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music;


    public String playMusic() {
        return "Plaing " + music.getSong();
    }


}
