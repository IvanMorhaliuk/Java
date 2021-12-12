package com.company;

import java.util.EmptyStackException;

import static com.company.Main.*;

public class UndoCommand extends Command{
    @Override
    public void execute(Integer... args) {
        try {
            String[] cmd = history.pop();
            Command command = commands.get(cmd[0]);
            Integer[] arguments = ParsingUnit.parseArgs(cmd);
            trash.push(cmd);
            command.cancel(arguments);
        } catch (EmptyStackException e){
            System.out.println("History is empty");
        }

    }

    @Override
    public void cancel(Integer... args) {

    }

    @Override
    public String name() {
        return "undo";
    }
}
