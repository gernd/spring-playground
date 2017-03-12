package de.gernd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @Value("${inResource}")
    private String inResourceVal;

    @Value("${foo.myconf}")
    private String configVal;

    @Value("${foo.random}")
    private String myRandom;

    @Value("${foo.testVal}")
    private String testVal;

    public void printConfig() {
        System.out.println("in Resource: " + inResourceVal);
        System.out.println("config val: " + configVal);
        System.out.println("random val: " + myRandom);
        System.out.println("test value: " + testVal);
    }
}
