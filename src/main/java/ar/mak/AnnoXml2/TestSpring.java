package ar.mak.AnnoXml2;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//https://www.youtube.com/watch?v=pDTzRsuGrDU
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextA2.xml");
//        Music music1 = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        musicPlayer1.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();

        System.out.println("===============================");
//        MusicPlayer music_Player = context.getBean("music_Player", MusicPlayer.class);
//        music_Player.playMusic();
        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();





    }
}
