package designpattern.behavioural.command;

import designpattern.behavioural.command.framework.Command;

public class ResizeCommand implements Command  {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
