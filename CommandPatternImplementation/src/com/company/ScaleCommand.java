package com.company;

import static com.company.Main.squares;

public class ScaleCommand extends Command{
    @Override
    public void execute(Integer... args) {
        Square square = squares.get(args[0]);
        if (square!=null) square.setLengthOfSide(square.getLengthOfSide() * args[1]);

    }

    @Override
    public void cancel(Integer... args) {
        Square square = squares.get(args[0]);
        if (square!=null) square.setLengthOfSide(square.getLengthOfSide() / args[1]);
    }

    @Override
    public String name() {
        return "scale or S";
    }
}
