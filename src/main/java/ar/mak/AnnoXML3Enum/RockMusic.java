package ar.mak.AnnoXML3Enum;

import ar.mak.MusicList;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class RockMusic implements MusicList {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}