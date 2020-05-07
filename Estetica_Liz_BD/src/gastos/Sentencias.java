/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastos;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class Sentencias {
    public static String LISTAR = "SELECT * FROM gastos ORDER BY fecha";

    public static String REGISTRAR = "INSERT INTO gastos(descripcion, gastado, fecha) "
            + "VALUES(?,?,?)";

    public static String ACTUALIZAR = "UPDATE gastos SET "
            + "descripcion=?, "
            + "gastado=?, "
            + "fecha=? "
            + "WHERE id=?";

    private int id;
    private String descripcion;
    private double gastado;
    private String fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getGastado() {
        return gastado;
    }

    public void setGastado(double gastado) {
        this.gastado = gastado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
