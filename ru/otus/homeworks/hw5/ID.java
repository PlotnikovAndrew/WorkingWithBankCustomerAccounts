package ru.otus.homeworks.hw5;

import java.util.concurrent.atomic.AtomicInteger;

public class ID {

    private static AtomicInteger atomicIntegerID = new AtomicInteger();

    private ID(){
    }

    public static int createID(){
        return atomicIntegerID.incrementAndGet();
    }
}
