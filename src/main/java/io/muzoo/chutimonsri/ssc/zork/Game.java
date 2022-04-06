package io.muzoo.chutimonsri.ssc.zork;

import io.muzoo.chutimonsri.ssc.zork.command.Command;
import io.muzoo.chutimonsri.ssc.zork.command.CommandFactory;
import io.muzoo.chutimonsri.ssc.zork.command.ExitCommand;

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
            Command command = CommandFactory.get(rawInput);
            if (command == null) {
                System.out.println("Try again");
            }else {
                command.execute(this);
            }

        }
    }
}
