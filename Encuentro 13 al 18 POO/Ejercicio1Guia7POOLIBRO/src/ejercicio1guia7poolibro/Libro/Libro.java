/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia7poolibro.Libro;

/**
 *
 * @author johan
 * Crear una clase llamada Libro que contenga los siguientes atributos:
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío.
 * Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
 * el autor del libro y el número de páginas.
 */
public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public String paginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
public String toString() {
    return "Libro: \n-ISBN: " + this.isbn + " \n-Título: " + this.titulo + " \n-Autor: " + this.autor + " \n-Páginas: " + this.paginas;
}

}