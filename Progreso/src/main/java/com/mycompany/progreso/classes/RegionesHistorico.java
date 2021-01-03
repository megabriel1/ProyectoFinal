
package com.mycompany.progreso.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.LocalDateTime;
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
import javax.persistence.Transient;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "regiones_historico")
public class RegionesHistorico implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "historico_id")
    private Integer historicoId;            
            
    @Column(name = "codigo")
    private String codigo;
    
    @Column(name = "nombre")
    private String nombre;          
    
    @Column(name = "tipo")        
    private String tipo;    
    
    @Column(name = "fecha_creado")
    private LocalDateTime fechaCreado;    
    
    @Column(name = "padre")
    private Integer padre;
    /*    
    @JsonIgnore
    @OneToMany(mappedBy = "historicoRegiones")
    private List<RegionesHistorico> historicoList;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "padre", referencedColumnName = "historico_id", insertable = false, updatable = false)
    private RegionesHistorico historicoRegiones;
   */
    public RegionesHistorico() {
    }

    public RegionesHistorico(Integer historicoId) {
        this.historicoId = historicoId;        
    }   
    
    public Integer getHistoricoId() {
        return historicoId;
    }

    public void setHistoricoId(Integer historicoId) {
        this.historicoId = historicoId;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(LocalDateTime fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public Integer getPadre() {
        return padre;
    }

    public void setPadre(Integer padre) {
        this.padre = padre;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.historicoId);
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
        final RegionesHistorico other = (RegionesHistorico) obj;
        if (!Objects.equals(this.historicoId, other.historicoId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegionesHistorico{" + "historicoId=" + historicoId + ", codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", fechaCreado=" + fechaCreado + ", padre=" + padre + ", historicoList=";
    }  
    
}