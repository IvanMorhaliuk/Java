package com.company;

import static com.company.Main.squares;

public class MoveCommand extends Command{
    @Override
    public void execute(Integer... args) {
        Square square = squares.get(args[0]);
        if (square!=null){
            square.setX(square.getX()+args[1]);
            square.setY(square.getY()+args[2]);
        }



    }

    @Override
    public void cancel(Integer... args) {
        Square square = squares.get(args[0]);
        if (square!=null){
            square.setX(square.getX()-args[1]);
            square.setY(square.getY()-args[2]);
        }
    }

    @Override
    public String name() {
        return "move or M";
    }
}
