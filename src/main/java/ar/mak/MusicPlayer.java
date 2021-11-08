package ar.mak;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private List<Music> listMusic = new ArrayList<>();

    public void playList (){
        for (Music v: listMusic){
            System.out.println(v.getSong());
        };
    }

    public void setListMusic(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        System.out.println(volume);
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }


}
