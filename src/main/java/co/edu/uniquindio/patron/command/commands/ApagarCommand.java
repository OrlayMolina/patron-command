package co.edu.uniquindio.patron.command.commands;

import co.edu.uniquindio.patron.command.receiver.Television;
import co.edu.uniquindio.patron.command.interfaces.ICommand;

public class ApagarCommand implements ICommand {

    private Television tv;

    public ApagarCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void ejecutar() {
        tv.apagar();
    }
}
