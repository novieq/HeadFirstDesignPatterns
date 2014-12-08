package commandpattern.commands;

public class NoCommand implements Command {

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        System.out.println(this.getClass().getName());

    }

}
