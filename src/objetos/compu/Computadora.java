/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos.compu;

import objetos.CPU;
import objetos.Mause;
import objetos.Monitor;
import objetos.Teclado;

/**
 *
 * @author jose_
 */
public class Computadora {
    private String marca;
    private String  modelo;
    private Teclado teclado;
    private CPU cpu;
    private Mause mause;
    private Monitor monitor;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Teclado teclado, CPU cpu, Mause mause, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.teclado = teclado;
        this.cpu = cpu;
        this.mause = mause;
        this.monitor = monitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Mause getMause() {
        return mause;
    }

    public void setMause(Mause mause) {
        this.mause = mause;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", teclado=" + teclado + ", cpu=" + cpu + ", mause=" + mause + ", monitor=" + monitor + '}';
    }
    
    
    
}
