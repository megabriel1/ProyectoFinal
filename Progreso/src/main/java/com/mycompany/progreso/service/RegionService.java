
package com.mycompany.progreso.service;

import com.mycompany.progreso.classes.Regiones;
import com.mycompany.progreso.classes.RegionesHistorico_1;
import java.time.LocalDateTime;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Gabriel
 */
@Stateless
public class RegionService {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Regiones> findAll(){
        CriteriaBuilder builder=this.entityManager.getCriteriaBuilder();
        
        CriteriaQuery <Regiones> query=builder.createQuery(Regiones.class);
        
        query.from(Regiones.class);
        
        return this.entityManager.createQuery(query).getResultList();
    }
    
    public Regiones findById(Integer regionId){
        return this.entityManager.find(Regiones.class, regionId);
    }
        
    public void Create(Regiones regiones){
        this.entityManager.persist(regiones);        
        RegionesHistorico_1 regionesHistorico=new RegionesHistorico_1();
        regionesHistorico.setCodigo(regiones.getCodigo());
        regionesHistorico.setNombre(regiones.getNombre()); 
        regionesHistorico.setPadre(regiones.getPadre());      
        regionesHistorico.setRegionId(regiones.getRegionId());
        regionesHistorico.setTipo("I");   
        regionesHistorico.setFechaCreado(LocalDateTime.now().minusYears(1));
        this.entityManager.persist(regionesHistorico);
    }
    
    public void Update(Regiones regiones){
        this.entityManager.merge(regiones);
        RegionesHistorico_1 regionesHistorico=new RegionesHistorico_1();
        regionesHistorico.setCodigo(regiones.getCodigo());
        regionesHistorico.setNombre(regiones.getNombre()); 
        regionesHistorico.setPadre(regiones.getPadre());      
        regionesHistorico.setRegionId(regiones.getRegionId());
        regionesHistorico.setTipo("U");   
        regionesHistorico.setFechaCreado(LocalDateTime.now().minusYears(1));
        this.entityManager.merge(regionesHistorico);
    }   
    
    public void Delete(Integer regionId){
        Regiones regiones=this.entityManager.find(Regiones.class, regionId);
        this.entityManager.remove(regiones);        
        RegionesHistorico_1 regionesHistorico=new RegionesHistorico_1();        
        regionesHistorico.setCodigo(regiones.getCodigo());
        regionesHistorico.setNombre(regiones.getNombre()); 
        regionesHistorico.setPadre(regiones.getPadre());      
        regionesHistorico.setRegionId(regiones.getRegionId());
        regionesHistorico.setTipo("D");   
        regionesHistorico.setFechaCreado(LocalDateTime.now().minusYears(1));        
        this.entityManager.persist(regionesHistorico);        
    }
}
