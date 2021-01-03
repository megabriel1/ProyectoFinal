
package com.mycompany.progreso.rest;

import com.mycompany.progreso.classes.Regiones;
import com.mycompany.progreso.classes.RegionesHistorico;
import com.mycompany.progreso.classes.RegionesHistorico_1;
import com.mycompany.progreso.service.MailService;
import com.mycompany.progreso.service.ProducerService;
import com.mycompany.progreso.service.RegionService;
import java.util.List;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Gabriel
 */
@Path("/rest")
public class RestEndPoint{
    
    @Inject
    private MailService mailService;    
    
    @Inject
    private RegionService regionService;
    
    @Inject
    private ProducerService producerService;
    
    @GET
    @Asynchronous
    @Produces(MediaType.APPLICATION_JSON)    
    public List<Regiones> findAll() {        
        this.mailService.SendMail();
        return this.regionService.findAll();
    }            
    
    @GET
    @Asynchronous
    @Produces(MediaType.APPLICATION_JSON)
    public Regiones findById(Integer regionId){        
        return this.regionService.findById(regionId);
    }   
    
    @POST
    @Asynchronous    
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Regiones Create(Regiones regiones, Regiones regionId){         
       this.producerService.CreateMessage(regiones);
       this.regionService.Create(regiones);                       
       this.mailService.SendMail2();
       return regiones;       
    }
    
    @PUT    
    @Asynchronous
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void Update(Regiones regiones){  
        RegionesHistorico_1 regionesHistorico=new RegionesHistorico_1();
        this.producerService.CreateMessage2(regionesHistorico);        
        this.regionService.Update(regiones);        
        this.mailService.SendMail3();
    }
    
    @Path("/{regionId}")
    @DELETE
    @Asynchronous
    @Produces(MediaType.APPLICATION_JSON)    
    public void Delete(@PathParam("regionId")Integer regionId, Regiones regiones){ 
        this.mailService.SendMail4();        
        this.regionService.Delete(regionId);        
        this.producerService.CreateMessage(regiones);
        RegionesHistorico regionesHistorico=new RegionesHistorico();
        regionesHistorico.setTipo("D");        
    }   
}