/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
 * @author fojomars
 */
public class Libro {
    
    // VARIABLES
    private String titulo;
    private String autor;
    private String ISBN;
    private float precio;
    private int unidades;

    //CONSTRUCTORES
    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, float precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.unidades = unidades;
    }
    
    
    // GETTER Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    
    // MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Titulo = " + titulo + " Autor = " + autor + " ISBN = " + ISBN + " Precio = " + precio + " Unidades = " + unidades;
    }
    
    
}
