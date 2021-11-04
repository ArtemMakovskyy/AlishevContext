package ar.mak;
//https://www.youtube.com/watch?v=nLCYk1ySY_U

import org.springframework.beans.factory.annotation.Value;

public class TestBean {
//    @Value("Artem Makovskyy")
    private String name;

    public TestBean(String name) {
        this.name = name;
        System.out.println("in TestBean(String name)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
