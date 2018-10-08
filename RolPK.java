/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.sponsoft.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Alumno
 */
@Embeddable
public class RolPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idrol")
    private int idrol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idregistro")
    private int idregistro;

    public RolPK() {
    }

    public RolPK(int idrol, int idregistro) {
        this.idrol = idrol;
        this.idregistro = idregistro;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(int idregistro) {
        this.idregistro = idregistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idrol;
        hash += (int) idregistro;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolPK)) {
            return false;
        }
        RolPK other = (RolPK) object;
        if (this.idrol != other.idrol) {
            return false;
        }
        if (this.idregistro != other.idregistro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.sponsoft.model.RolPK[ idrol=" + idrol + ", idregistro=" + idregistro + " ]";
    }
    
}
