package com.company;

public abstract class Command {
    public abstract void execute(Integer... args);
    public abstract void cancel(Integer... args);
    public abstract String name();
}
