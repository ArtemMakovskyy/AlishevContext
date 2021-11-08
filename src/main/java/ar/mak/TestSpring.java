package ar.mak;
//https://www.youtube.com/watch?v=nLCYk1ySY_U

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.setVolume(10);
        musicPlayer.getName();
        musicPlayer.getVolume();
        ar.mak.MusicPlayer musicPlayer2 = context.getBean("musicPlayer", ar.mak.MusicPlayer.class);
        musicPlayer2.getVolume();


        System.out.println("===========all==========");
        ar.mak.MusicPlayer musicPlayer3 = context.getBean("musicPlayer", ar.mak.MusicPlayer.class);
        musicPlayer3.playList();
        context.close();
    }
}
