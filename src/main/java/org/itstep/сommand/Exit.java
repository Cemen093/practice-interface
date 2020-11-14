package org.itstep.сommand;

public class Exit implements Command{
    @Override
    public void execute(String... args) {
        System.exit(0);
    }
}
