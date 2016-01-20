/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtcp;

/**
 *
 * @author desarrollo2
 */
import java.lang.*;
import java.io.*;
import java.net.*;

class Server {
   public static void main(String args[]) {
      String data = "Mensaje desde el servidor.";
      try {
         ServerSocket server = new ServerSocket(1234);
         Socket socket = server.accept(); 
         System.out.print("El servidor se ha conectado!\n");
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
         System.out.print("enriando...: '" + data + "'\n");
         out.print(data);
         out.close();
         socket.close();
         server.close();
      }
      catch(Exception e) {
         System.out.print("Whoops! It didn't work!\n");
      }
   }
}
