/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progreso.classes;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "regiones_historico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegionesHistorico_1.findAll", query = "SELECT r FROM RegionesHistorico_1 r"),
    @NamedQuery(name = "RegionesHistorico_1.findByHistoricoId", query = "SELECT r FROM RegionesHistorico_1 r WHERE r.historicoId = :historicoId"),
    @NamedQuery(name = "RegionesHistorico_1.findByCodigo", query = "SELECT r FROM RegionesHistorico_1 r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "RegionesHistorico_1.findByNombre", query = "SELECT r FROM RegionesHistorico_1 r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "RegionesHistorico_1.findByTipo", query = "SELECT r FROM RegionesHistorico_1 r WHERE r.tipo = :tipo"),
    @NamedQuery(name = "RegionesHistorico_1.findByFechaCreado", query = "SELECT r FROM RegionesHistorico_1 r WHERE r.fechaCreado = :fechaCreado"),
    @NamedQuery(name = "RegionesHistorico_1.findByPadre", query = "SELECT r FROM RegionesHistorico_1 r WHERE r.padre = :padre")})
public class RegionesHistorico_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "historico_id")
    private Integer historicoId;
    @Size(max = 30)
    @Column(name = "codigo")
    private String codigo;
    
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    
    @Size(max = 5)
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "fecha_creado")    
    private LocalDateTime fechaCreado;
    
    @Column(name = "padre")
    private Integer padre;
    
    @Column(name = "region_id")
    private Integer regionId;
    
    public RegionesHistorico_1() {
    }

    public RegionesHistorico_1(Integer historicoId) {
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

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getRegionId() {
        return regionId;
    }    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historicoId != null ? historicoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionesHistorico_1)) {
            return false;
        }
        RegionesHistorico_1 other = (RegionesHistorico_1) object;
        if ((this.historicoId == null && other.historicoId != null) || (this.historicoId != null && !this.historicoId.equals(other.historicoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Informacion ha sido modificada en la clase Regiones.";
    }
    
}
