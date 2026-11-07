package ru.gr05503.application;

public interface Command {
    void execute();
    void undo();
}
