package ar.mak;

//https://www.youtube.com/watch?v=Ns0IxBXDbWw
//https://www.youtube.com/watch?v=GLkbnYLkIDc  //git
public class ClassicalMusic implements Music {
    //создаем приватный конструктор для фабричного метода
    //чтоб нельзя было создать NEW объект
    private ClassicalMusic() {
    }

    //создаем статичный метод для вызова объекта
    public static ar.mak.ClassicalMusic getClassicalMusic() {
        return new ar.mak.ClassicalMusic();
    }
    void init(){
        System.out.println("init classical");
    }
    void destroy(){
        System.out.println("destroy classical");
    }

    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
