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

class Client {
   public static void main(String args[]) {
      try {
         Socket socket = new Socket("localhost", 1234);
         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         System.out.print("Mensaje Recibido: ");

         while (!in.ready()) {}
         System.out.print(in.readLine()); // Read one line and output it

         System.out.print("\n");
         in.close();
      }
      catch(Exception e) {
         System.out.print("No se pudo establecer contacto con el servidor\n");
      }
   }
}