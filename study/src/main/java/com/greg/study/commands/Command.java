package com.greg.study.commands;

import java.util.function.Consumer;

public interface Command<T> {
    void execute(T data, Consumer<T> consumer);
}
