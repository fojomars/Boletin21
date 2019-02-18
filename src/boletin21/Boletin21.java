/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import Libreria.*;
import Utilidades.PedirDatos;
import java.util.ArrayList;

/**
 *
 * @author fojomars
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        ArrayList<Libro> lista = new ArrayList<>();
         do {
        String op = PedirDatos.ler("******MENÚ******\n" + " 1-> crear\n 2-> añadir\n 3-> ver\n 4-> vender\n 5-> salir ");
        switch (op){
            case "crear": 
                obx.crearLibro(lista);
            case "añadir":
                obx.añadirLibros(lista);
                break;
            case "ver":
                obx.mostrar(lista);
                break;
            case "vender":
                obx.venderLibros(lista);
                break;
            case "salir":
                System.exit(0);
                break;      
        }
        } while (true); 
        
        
    }
    
}
