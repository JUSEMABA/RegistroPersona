/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

/**
 *
 * @author UFPSO
 */
public class Nodo {
    private String nombre;
    private String documento;
    private int edad;
    private Nodo Anterior;
    private Nodo Siguiente;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the Anterior
     */
    public Nodo getAnterior() {
        return Anterior;
    }

    /**
     * @param Anterior the Anterior to set
     */
    public void setAnterior(Nodo Anterior) {
        this.Anterior = Anterior;
    }

    /**
     * @return the Siguiente
     */
    public Nodo getSiguiente() {
        return Siguiente;
    }

    /**
     * @param Siguiente the Siguiente to set
     */
    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }
            
}
