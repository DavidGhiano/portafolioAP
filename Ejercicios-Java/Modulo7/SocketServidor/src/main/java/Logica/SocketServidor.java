
package Logica;

import Sockets.Servidor;
import java.io.IOException;

public class SocketServidor {
    public static void main(String[] args) throws IOException {
        Servidor servi = new Servidor();
        System.out.println("Iniciando el servidor... \n");
        servi.startServer();
    }
}
