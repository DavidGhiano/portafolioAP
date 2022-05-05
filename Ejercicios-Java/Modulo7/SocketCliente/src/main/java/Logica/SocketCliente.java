package Logica;

import Sockets.Cliente;
import java.io.IOException;

public class SocketCliente {
    public static void main(String[] args) throws IOException{
        Cliente cli = new Cliente();
        
        System.out.println("Iniciando cliente\n");
        cli.startClient();
    }
}
