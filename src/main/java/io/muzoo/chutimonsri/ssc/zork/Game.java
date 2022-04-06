package io.muzoo.chutimonsri.ssc.zork;

import io.muzoo.chutimonsri.ssc.zork.command.*;

import java.util.Scanner;

public class Game {
    private boolean exit = false;

    private Scanner scanner = new Scanner(System.in);

    public boolean isExit() {
        return exit;
    }

    public void exit() {
        this.exit = true;
        scanner.close();
    }

    public void start() {
        System.out.println("Game Started");

        while (!isExit() && scanner.hasNextLine()){
            String rawInput = scanner.nextLine();
            System.out.println("You entered string " + rawInput);
            CommandType commandType = CommandParser.parseCommand(rawInput);
            Command command = CommandFactory.get(commandType);
            if (command == null) {
                System.out.println("Try again");
            }else {
                command.execute(this);
            }

        }
    }
}
