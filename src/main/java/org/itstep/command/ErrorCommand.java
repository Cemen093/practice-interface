package org.itstep.command;

public class ErrorCommand implements Command{
    @Override
    public void execute(String... args) {
        System.out.println("Error");
    }
}
