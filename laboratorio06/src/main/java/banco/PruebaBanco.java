/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IDAT
 */
public class PruebaBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan","Solar","70721885","987654321",521);
        Cliente cliente2 = new Cliente("Juana","Solares","70758285","987654321",9621);
        Cliente cliente3 = new Cliente("Juanita","Solarito","70581885","987654321",52631);
         
        Banco banco = new Banco(cliente1,cliente2,cliente3);
        
        cliente1.deposito(500);
        cliente1.deposito(100);
        cliente1.deposito(2000);
 
        
        banco.imprimirclientes();
        banco.imprimirsaldoclientes();
        
    }
}
