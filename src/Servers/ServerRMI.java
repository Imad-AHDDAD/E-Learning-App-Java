/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servers;

import interfaces.BoardRemoteImpl;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {
    
    public static void main(String[] args) throws Exception {
        
        LocateRegistry.createRegistry(1099);
        
        System.out.println("server RMI start ... ");
        
        BoardRemoteImpl borBoardRemoteImpl = new BoardRemoteImpl();
        Naming.bind("boardremote", borBoardRemoteImpl);
    }
    
}
