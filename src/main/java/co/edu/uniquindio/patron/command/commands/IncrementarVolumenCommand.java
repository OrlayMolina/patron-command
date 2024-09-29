package co.edu.uniquindio.patron.command.commands;

import co.edu.uniquindio.patron.command.receiver.Television;
import co.edu.uniquindio.patron.command.interfaces.ICommand;

public class IncrementarVolumenCommand implements ICommand {

    private Television tv;

    public IncrementarVolumenCommand(Television tv) {
        this.tv = tv;
    }
    @Override
    public void ejecutar() {
        tv.incrementarVolumen();
    }
}
