package com.hillel.livinsky.lessons.homework16;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();

        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.iosUpdate();

        androids.call();
        androids.sms();
        androids.internet();
        androids.linuxUpdate();
    }
}
