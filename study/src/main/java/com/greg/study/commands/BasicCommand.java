package com.greg.study.commands;

import java.util.function.Consumer;

public class BasicCommand<T> implements Command<T> {

    @Override
    public void execute(T data, Consumer<T> consumer) {
        consumer.accept(data);
    }

}
