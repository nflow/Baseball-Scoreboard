package at.nwork;

import java.io.IOException;
import java.net.*;

public class UdpScreen extends Screen {

    private DatagramSocket clientSocket;
    private InetAddress ipAddress;
    private int port;

    public UdpScreen(int width, int height, String host, int port) throws UnknownHostException, SocketException {
        super(width, height);
        this.port = port;
        clientSocket = new DatagramSocket();
        ipAddress = InetAddress.getByName(host);
    }

    public void update() throws IOException {
        DatagramPacket sendPacket = new DatagramPacket(getScreen(), getScreen().length, ipAddress, port);
        clientSocket.send(sendPacket);
    }

    public void closeConnection() {
        clientSocket.close();
    }
}
