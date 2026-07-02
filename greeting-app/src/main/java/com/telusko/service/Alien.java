package com.telusko.service;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Alien
{
    static
    {
        System.out.println("Static block of Alien class");
    }
    {
        System.out.println("Init block of Alien class");
    }
    Alien()
    {
        System.out.println("Constructor of Alien class");
    }
    @PostConstruct
    static void staticMethod()
    {
        System.out.println("Static method of Alien class");
    }
    public void nonStaticMethod()
    {
        System.out.println("Non static method of Alien class");
    }
    @PreDestroy
    public void destroyMethod()
    {
        System.out.println("Destroy method of Alien class");
    }


}
