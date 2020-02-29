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
public class personal {
     String id;
     String admin,emple;

    public personal(String id, String admin, String emple) {
        this.id = id;
        this.admin = admin;
        this.emple = emple;
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

    public String getEmple() {
        return emple;
    }

    public void setEmple(String emple) {
        this.emple = emple;
    }
     

}
