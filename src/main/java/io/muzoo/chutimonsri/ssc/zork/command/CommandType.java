package io.muzoo.chutimonsri.ssc.zork.command;


public enum CommandType {
    INFO(InfoCommand.class, "info"),
    EXIT(ExitCommand.class, "exit"),
    TAKE(TakeCommand.class, "take"),
    USE(UseCommand.class, "use"),
    DROP(DropCommand.class, "drop"),
    ATTACK(AttackWithCommand.class, "attack"),
    GO(GoCommand.class, "go");

    private  Class<? extends Command> commandClass;

    private String commandWord;

    CommandType(Class<? extends Command> commandClass, String commandWord) {
        this.commandClass = commandClass;
        this.commandWord = commandWord;
    }

    public Class getCommandClass(){
        return commandClass;
    }

    public String getCommandWord() {
        return commandWord;
    }

    public boolean match(String rawInput) {
        return rawInput.startsWith(commandWord);
    }
}
