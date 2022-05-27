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
    
    private JTextField campo;
    private String valor;

    public Accion() {
    }

    public Accion(JTextField campo, String valor) {
        this.campo = campo;
        this.valor = valor;
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
    
    
}
