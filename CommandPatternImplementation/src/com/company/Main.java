package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static Map<Integer,Square> squares = new HashMap<>();
    public static Stack<String[]> history = new Stack<>();
    public static Stack<String[]> trash = new Stack<>();
    public static Map<String,Command> commands = new HashMap<>( Map.of(
            "C", new CreateCommand(),
            "M", new MoveCommand(),
            "S", new ScaleCommand(),
            "U", new UndoCommand(),
            "R", new RedoCommand(),
            "P", new PrintCommand()
    ));
    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);


	    while (true){
            System.out.print("javaBash >>");
            String[] cmd = sin.nextLine().split(" ");
            if(cmd[0].equals("E")) break;
            Command command = commands.get(cmd[0]);
            Integer[] arguments = ParsingUnit.parseArgs(cmd);
            command.execute(arguments);
            if(! (command instanceof UndoCommand) && !(command instanceof RedoCommand) && !(command instanceof PrintCommand)){
                trash.clear();
                history.push(cmd);
            }
            System.out.println("History stack:");
            for(int i=0;i<history.size();i++){
                System.out.println("" + i + ":" + Arrays.toString(history.get(i)));
            }
            System.out.println("Trash stack:");
            for(int i=0;i<trash.size();i++){
                System.out.println("" + i + ":" + Arrays.toString(trash.get(i)));
            }
        }
        sin.close();
    }
}
