package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Receiver;

public abstract class Command<T extends Receiver> {
    protected T receiver;

    public Command(T rc) {
        this.receiver = rc;
    }

    public abstract void execute();
}
