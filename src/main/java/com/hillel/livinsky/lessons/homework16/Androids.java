package com.hillel.livinsky.lessons.homework16;

public class Androids implements Smartphones,LinuxOS{
    @Override
    public void call() {
        System.out.println("Androids call");

    }

    @Override
    public void sms() {
        System.out.println("Androids sms");

    }

    @Override
    public void internet() {
        System.out.println("Androids internet");

    }

    @Override
    public void linuxUpdate() {
        System.out.println("Androids update 1.0");

    }
}
