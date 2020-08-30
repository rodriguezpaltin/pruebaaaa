/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdnombre", query = "SELECT c FROM Cliente c WHERE c.idnombre = :idnombre")
    , @NamedQuery(name = "Cliente.findByApellido", query = "SELECT c FROM Cliente c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Cliente.findByCedula", query = "SELECT c FROM Cliente c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "Cliente.findByEdad", query = "SELECT c FROM Cliente c WHERE c.edad = :edad")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idnombre")
    private Integer idnombre;
    @Size(max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 45)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 45)
    @Column(name = "edad")
    private String edad;

    public Cliente() {
    }

    public Cliente(Integer idnombre, String apellido, String cedula, String direccion, String edad) {
        this.idnombre = idnombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.edad = edad;
    }

    public Cliente(Integer idnombre) {
        this.idnombre = idnombre;
    }

    public Integer getIdnombre() {
        return idnombre;
    }

    public void setIdnombre(Integer idnombre) {
        this.idnombre = idnombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnombre != null ? idnombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idnombre == null && other.idnombre != null) || (this.idnombre != null && !this.idnombre.equals(other.idnombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo1.Cliente[ idnombre=" + idnombre + " ]";
    }
    
}
