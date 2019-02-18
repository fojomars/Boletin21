/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Metodos {
    
    // MÉTODO PARA CREAR LIBROS 
    public void crearLibro(ArrayList <Libro> lista){
        String titulo = JOptionPane.showInputDialog("Título: ");
        String autor = JOptionPane.showInputDialog("Autor: ");
        String isbn = JOptionPane.showInputDialog("ISBN: ");
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Prezo: "));
        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Número de unidades: "));
        Libro l = new Libro(titulo, autor, isbn, precio, unidades);
        lista.add(l);
    }
    
    // MÉTODO PARA AÑADIR LIBROS AL ARRAYLIST
    public void añadirLibros(ArrayList <Libro> lista){
        String isbn = JOptionPane.showInputDialog("Introduzca el ISBN: ");
        for(Libro l:lista){
            if(isbn.equalsIgnoreCase(l.getISBN())){
                l.setUnidades(l.getUnidades()+Integer.parseInt(JOptionPane.showInputDialog("Introduzca las unidades que quiera añadir: ")));
            }
        }
    }
    
    // MÉTODO VENDER LIBROS 
    public void venderLibros(ArrayList <Libro> lista){
        String isbn = JOptionPane.showInputDialog("Introduzca el ISBN: ");
        for(Libro l: lista){
            if(isbn.equalsIgnoreCase(l.getISBN())){
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las unidades a vender: "));
                if(numero>l.getUnidades())
                    l.setUnidades(0);
                else
                    l.setUnidades((l.getUnidades())-numero);
            }
        } 
    }
    
    // MÉTODO MOSTRAR LIBROS
    public void mostrar(ArrayList <Libro> lista){
        System.out.println("*********** MOSTRADO DATOS DEL LIBRO ***********");
        for(Libro l:lista){
            System.out.println(l);
        }
    }
    
}
