package com.company;

import java.util.EmptyStackException;

import static com.company.Main.*;

public class RedoCommand extends Command{
    @Override
    public void execute(Integer... args) {
        try {
            String[] cmd = trash.pop();
            Command command = commands.get(cmd[0]);
            Integer[] arguments = ParsingUnit.parseArgs(cmd);
            history.push(cmd);
            command.execute(arguments);
        }catch (EmptyStackException e){
            System.out.println("Trash is empty");
        }

    }

    @Override
    public void cancel(Integer... args) {

    }

    @Override
    public String name() {
        return "redo";
    }
}
