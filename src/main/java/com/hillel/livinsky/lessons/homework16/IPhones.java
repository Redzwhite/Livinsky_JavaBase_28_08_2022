package com.hillel.livinsky.lessons.homework16;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("IOS call");

    }

    @Override
    public void sms() {
        System.out.println("IOS sms");

    }

    @Override
    public void internet() {
        System.out.println("IOS internet");

    }

    @Override
    public void iosUpdate() {
        System.out.println("IOS update 1.0");
    }
}
