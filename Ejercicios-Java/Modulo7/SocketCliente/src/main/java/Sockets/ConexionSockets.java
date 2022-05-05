package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConexionSockets {
    private final int puerto = 8080;
    private final String host = "localhost";
    protected String mensajeServidor;
    protected ServerSocket socketServidor;
    protected Socket socketCliente;
    protected DataOutputStream salidaServidor, salidaCliente;
    
    public ConexionSockets(String tipo) throws IOException{
        if(tipo.equalsIgnoreCase("servidor"))
        {
            this.socketServidor = new ServerSocket(puerto);
            this.socketCliente = new Socket();
        }
        else{
            this.socketCliente = new Socket(host,puerto);
        }
    }
}
