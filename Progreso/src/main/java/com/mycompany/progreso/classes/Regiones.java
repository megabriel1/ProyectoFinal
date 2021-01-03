package com.mycompany.progreso.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "Regiones")
@DynamicUpdate
@DynamicInsert
@XmlRootElement
public class Regiones implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Integer regionId;
        
    @Column(name = "codigo")
    private String codigo;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "padre")
    private Integer padre;    
    
    @JsonIgnore
    @OneToMany(mappedBy = "padreRegiones")
    private List<Regiones> regionesHijasList;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "padre", referencedColumnName = "region_id", insertable = false, updatable = false)
    private Regiones padreRegiones;
    
    public Regiones() {
    }

    public Regiones(Integer regionId, String codigo, String nombre, Integer padre) {
        this.regionId = regionId;
        this.codigo = codigo;
        this.nombre = nombre;
        this.padre = padre;
    }   

    public void setPadreRegiones(Regiones padreRegiones) {
        this.padreRegiones = padreRegiones;
    }

    public Regiones getPadreRegiones() {
        return padreRegiones;
    }

    public void setRegionesHijasList(List<Regiones> regionesHijasList) {
        this.regionesHijasList = regionesHijasList;
    }

    public List<Regiones> getRegionesHijasList() {
        return regionesHijasList;
    }   
    
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPadre() {
        return padre;
    }

    public void setPadre(Integer padre) {
        this.padre = padre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.regionId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Regiones other = (Regiones) obj;
        if (!Objects.equals(this.regionId, other.regionId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Informacion ha sido ingresada o borrada de la clase Regiones.";
    }    
    
}