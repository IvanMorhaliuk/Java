package com.company;

import java.util.TreeMap;

import static com.company.Main.squares;

public class PrintCommand extends Command{
    @Override
    public void execute(Integer... args) {
        TreeMap<Integer,Square> sorted = new TreeMap<>(squares);
        sorted.forEach((key,value)-> System.out.println(""+key+":"+value.toString()));

    }

    @Override
    public void cancel(Integer... args) {

    }

    @Override
    public String name() {
        return "print or P";
    }
}
