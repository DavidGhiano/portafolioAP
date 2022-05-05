package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends ConexionSockets {

    public Cliente() throws IOException {
        super("cliente");
    }

    public void startClient() {
        try {
            salidaServidor = new DataOutputStream(socketCliente.getOutputStream());

            for (int i = 0; i < 100; i++) {
                salidaServidor.writeUTF("Este es el mensaje numero " + (i + 1) + "\n");
            }
            socketCliente.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
