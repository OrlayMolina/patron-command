package co.edu.uniquindio.patron.command;

import co.edu.uniquindio.patron.command.commands.ApagarCommand;
import co.edu.uniquindio.patron.command.commands.EncenderCommand;
import co.edu.uniquindio.patron.command.commands.DecrementarVolumenCommand;
import co.edu.uniquindio.patron.command.interfaces.ICommand;
import co.edu.uniquindio.patron.command.commands.IncrementarVolumenCommand;
import co.edu.uniquindio.patron.command.invoker.ControlRemoto;
import co.edu.uniquindio.patron.command.receiver.Television;

public class Main {

    public static void main(String[] args) {
        // Crear el receptor (la televisión)
        Television tv = new Television();

        // Crear comandos concretos
        ICommand encender = new EncenderCommand(tv);
        ICommand apagar = new ApagarCommand(tv);
        ICommand subirVolumen = new IncrementarVolumenCommand(tv);
        ICommand bajarVolumen = new DecrementarVolumenCommand(tv);

        // Crear el invocador (el control remoto)
        ControlRemoto remote = new ControlRemoto();

        remote.setCommand(encender);
        remote.presionarBoton();

        remote.setCommand(subirVolumen);
        remote.presionarBoton();

        remote.setCommand(bajarVolumen);
        remote.presionarBoton();

        remote.setCommand(apagar);
        remote.presionarBoton();
    }
}
