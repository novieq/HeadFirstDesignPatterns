package commandpattern.commands;

public class MacroCommand {
    Command[] commands;
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    public void execute() {
        for(int i=0;i<commands.length;i++) {
            commands[i].execute();
        }
    }
}
