package org.itstep;

import org.itstep.сommand.UsersCommand;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">>> ");
            UsersCommand command = UsersCommand.convert(scanner.nextLine());
            command.getCommand().execute();
        }
    }
}
