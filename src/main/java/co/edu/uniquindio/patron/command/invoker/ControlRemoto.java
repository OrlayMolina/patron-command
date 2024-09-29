package co.edu.uniquindio.patron.command.invoker;

import co.edu.uniquindio.patron.command.interfaces.ICommand;

public class ControlRemoto {

    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void presionarBoton() {
        command.ejecutar();
    }
}
