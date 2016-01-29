/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp2;

/**
 *
 * @author desarrollo2
 */
import java.io.*; 
import java.net.*; 

class TCPServer {    
    public static void main(String argv[]) throws Exception       {          
        String msg="";          
        String mayus;          
        
        System.out.println("Servidor Activo");
        while(msg != "salir"){      
            
            ServerSocket serverSocket = new ServerSocket(6789); 
            Socket socket;
            socket = serverSocket.accept();  
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));             
                DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());             
                msg = inFromClient.readLine();             
                System.out.println("Recibido del cliente: " + msg);             
                mayus = msg.toUpperCase() + '\n';             
                outToClient.writeBytes(mayus);    

            socket.close();
            serverSocket.close();
        } 
        
        
    } 
} 