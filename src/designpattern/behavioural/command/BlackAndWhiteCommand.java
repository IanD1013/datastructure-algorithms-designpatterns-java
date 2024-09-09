package designpattern.behavioural.command;

import designpattern.behavioural.command.framework.Command;

public class BlackAndWhiteCommand implements Command  {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
