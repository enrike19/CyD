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
    class TCPClient {  
        public static void main(String argv[]) throws Exception  {  
            
            String msg="";   
            String msg_mayus;   
            
            while(msg != "salir"){
                BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));   
                Socket socket = new Socket("localhost", 6789);   
                DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());   
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));   
                msg = inFromUser.readLine();   
                outToServer.writeBytes(msg + '\n');   
                msg_mayus = inFromServer.readLine();   

                System.out.println("FROM SERVER: " + msg_mayus);
                socket.close();  
            }
        } 
    } 