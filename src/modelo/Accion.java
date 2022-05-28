/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JTextField;

/**
 *
 * @author JhojanDS
 * @email jhojanlopez327@gmail.com
 */
public class Accion {
    
    private JTextField campo;//campo en donde se almacena graficamente
    private String valor;//valor de ese campo
    private int fila; //valor de la posicion de la fila en la matriz sudoku (donde se almacena logicamente)
    private int columna; //valor de la posicion de la columna en la matriz sudoku (donde se almacena logicamente)
    
    public Accion() {
    }

    public Accion(JTextField campo, String valor, int fila, int columna) {
        this.campo = campo;
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
    }

    
    public JTextField getCampo() {
        return campo;
    }

    public void setCampo(JTextField campo) {
        this.campo = campo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Accion{" + "campo=" + campo + ", valor=" + valor + ", fila=" + fila + ", columna=" + columna + '}';
    }
    
    
    
}
