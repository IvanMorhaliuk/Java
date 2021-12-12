package com.company;

import java.util.Arrays;

public class ParsingUnit {
    public static Integer[] parseArgs(String[] args){
        return Arrays.stream(args).filter(item->item.matches(".*\\d.*")).map(Integer::parseInt).toArray(Integer[]::new);
    }
}
