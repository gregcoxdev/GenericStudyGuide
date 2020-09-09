package com.greg.study.commands;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class TimedCommand<T> implements Command<T> {

    @Override
    public void execute(T data, Consumer<T> consumer) {
        long startTime = System.nanoTime();
        consumer.accept(data);
        long duration = (System.nanoTime() - startTime);
        System.out.printf("Consumer executed in %s.\n", getHumanReadableTime(duration));
    }

    /**
     * Convert nanoseconds to a human readable format. Took this from stack overflow so I didn't
     * have to write this myself.
     * @see <a href="https://stackoverflow.com/questions/45061338/get-human-readable-time-from-nanoseconds</a>
     * @param nanos The nanoseconds to convert to human readable format.
     * @return A string representing a human readable format of nanoseconds.
     */
    private static String getHumanReadableTime(long nanos) {

        TimeUnit unitToPrint = null;
        StringBuilder result = new StringBuilder();

        for (TimeUnit t: TimeUnit.values()) {
            if (unitToPrint == null) {
                unitToPrint = t;
                continue;
            }

            // Convert 1 of "t" to "unitToPrint", to get the conversion factor.
            long conversionFactor = unitToPrint.convert(1, t);
            long value = nanos % conversionFactor;
            nanos /= conversionFactor;

            result.insert(0, value + " " + unitToPrint + " ");

            unitToPrint = t;
            if (nanos == 0) {
                break;
            }
        }

        if (nanos != 0) {
            result.insert(0, nanos + " " + unitToPrint + " ");
        }

        return result.toString().trim();
    }

}
