package org.itstep.сommand;

public class Echo implements Command{
    @Override
    public void execute(String... args) {
        System.out.println("echo Hello World");
    }
}
