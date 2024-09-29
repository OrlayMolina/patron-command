package co.edu.uniquindio.patron.command.commands;

import co.edu.uniquindio.patron.command.receiver.Television;
import co.edu.uniquindio.patron.command.interfaces.ICommand;

public class DecrementarVolumenCommand implements ICommand {

    private Television tv;

    public DecrementarVolumenCommand(Television tv) {
        this.tv = tv;
    }
    @Override
    public void ejecutar() {
        tv.decrementarVolumen();
    }
}
