package com.company;

import java.util.Arrays;

import static com.company.Main.squares;

public class CreateCommand extends Command{
    @Override
    public void execute(Integer... args) {
        System.out.println("command with name -> " + this.name() + " was executed with args: " + Arrays.toString(args));
        squares.put(args[0],new Square(0,0,args[1]));
    }

    @Override
    public void cancel(Integer... args) {
        squares.remove(args[0]);
    }

    @Override
    public String name() {
        return "create";
    }
}
