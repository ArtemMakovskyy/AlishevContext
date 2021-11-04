package ar.mak;
//https://www.youtube.com/watch?v=nLCYk1ySY_U
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());
        context.close();
    }
}
