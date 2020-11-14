package org.itstep.сommand;

public enum UsersCommand {
    Help,
    Echo,
    Now,
    Exit,
    Error;

    private Command command;

    UsersCommand() {
        switch (this.name()){
            case "Help":
                this.command = new Help();
                break;
            case "Echo":
                this.command = new Echo();
                break;
            case "Now":
                this.command = new Now();
                break;
            case "Exit":
                this.command = new Exit();
                break;
            default:
                this.command = new Error();
                break;
        }
    }

    /*UsersCommand(String str) {
        switch (str){
            case "help":
                this.command = new Help();
            case "echo":
                this.command = new Echo();
            case "now":
                this.command = new Now();
            case "exit":
                this.command = new Exit();
            default:
                this.command = new Error();
        }
    }*/

    public static UsersCommand convert(String str){
        switch (str){
            case "help":
                return Help;
            case "echo":
                return Echo;
            case "now":
                return Now;
            case "exit":
                return Exit;
            default:
                return Error;
        }
    }

    public Command getCommand() {
        return command;
    }
}
