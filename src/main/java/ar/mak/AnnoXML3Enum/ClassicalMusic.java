package ar.mak.AnnoXML3Enum;

import ar.mak.Music;
import ar.mak.MusicList;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements MusicList {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("init");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("destroy");
    }
}