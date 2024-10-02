package designpattern.creational.singleton.exercise_logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Look at the Logger class. With the current implementation, we can
 * create multiple loggers writing to the same log file in parallel.
 * Use the singleton pattern to ensure only a single logger can be
 * instantiated for a given file.
 */

public class Logger {
    private String fileName;
    private static Map<String, Logger> instances = new HashMap<>();

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }

    public static Logger getInstance(String fileName) {
        if (!instances.containsKey(fileName))
            instances.put(fileName, new Logger(fileName));
        return instances.get(fileName);
    }
}
