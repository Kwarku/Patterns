package pl.narodzinyprogramisty.CommandPattern;

public class Paint {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(int x, int y){
        command.execute(x,y);
        command = null;
    }
}
