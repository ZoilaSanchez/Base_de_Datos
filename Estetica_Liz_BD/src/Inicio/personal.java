/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

/**
 *
 * @author Lopez
 */
class personal {
    private String id,admin,empelado;

    public personal(String id, String admin, String empelado) {
        this.id = id;
        this.admin = admin;
        this.empelado = empelado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getEmpelado() {
        return empelado;
    }

    public void setEmpelado(String empelado) {
        this.empelado = empelado;
    }
    
}
