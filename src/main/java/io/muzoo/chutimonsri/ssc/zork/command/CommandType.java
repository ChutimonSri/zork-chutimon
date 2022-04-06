package io.muzoo.chutimonsri.ssc.zork.command;


public enum CommandType {
    INFO(InfoCommand.class),
    EXIT(ExitCommand.class);

    private  Class<? extends Command> commandClass;

    CommandType(Class<? extends Command> commandClass) {
        this.commandClass = commandClass;
    }
    public Class getCommandClass(){
        return commandClass;
    }
}
