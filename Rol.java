/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.sponsoft.model;

import java.io.Serializable;


/**
 *
 * @author Alumno
 */

public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
  
    protected RolPK rolPK;
    
    private Registro registro;

    public Rol() {
    }

    public Rol(RolPK rolPK) {
        this.rolPK = rolPK;
    }

    public Rol(int idrol, int idregistro) {
        this.rolPK = new RolPK(idrol, idregistro);
    }

    public RolPK getRolPK() {
        return rolPK;
    }

    public void setRolPK(RolPK rolPK) {
        this.rolPK = rolPK;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolPK != null ? rolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.rolPK == null && other.rolPK != null) || (this.rolPK != null && !this.rolPK.equals(other.rolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.sponsoft.model.Rol[ rolPK=" + rolPK + " ]";
    }
    
}
