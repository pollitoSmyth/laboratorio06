/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseVentanaS;

/**
 *
 * @author IDAT
 */
public class VentanaTitulo extends Ventana{
    protected String titulo;
    public VentanaTitulo(int x, int y, int w, int h, String nombre) {
        super(x, y, w, h);
        titulo = nombre;
    }
    
    public void mostrar() {
        super.mostrar();
        System.out.println("Título : " + titulo);
    }
    public void desplazar(int dx, int dy) {
        x += dx;
        y += dy;
    }

}
