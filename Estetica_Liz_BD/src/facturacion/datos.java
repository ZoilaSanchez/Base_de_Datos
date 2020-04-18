/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author Lopez
 */
public class datos {
    private int codigo;
    private String nombre;
    private int candidad;
    private float precio;
    private float total;

    public datos(int codigo, String nombre, int candidad, float precio, float total) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.candidad = candidad;
        this.precio = precio;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCandidad() {
        return candidad;
    }

    public void setCandidad(int candidad) {
        this.candidad = candidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
