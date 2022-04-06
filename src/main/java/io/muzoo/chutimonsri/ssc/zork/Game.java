package io.muzoo.chutimonsri.ssc.zork;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    public void start() {
        System.out.println("Game Started");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String rawInput = scanner.nextLine();
            System.out.println("You entered string " + rawInput);
            if ("exist".equalsIgnoreCase(rawInput)){
                break;
            }
        }
        scanner.close();
    }
}
