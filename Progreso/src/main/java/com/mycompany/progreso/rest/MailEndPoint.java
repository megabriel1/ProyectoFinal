
package com.mycompany.progreso.rest;

import com.mycompany.progreso.classes.Regiones;
import com.mycompany.progreso.service.MailService;
import com.mycompany.progreso.service.RegionService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Gabriel
 */
@Path("/suertudo")
public class MailEndPoint{
        
    @Inject
    private MailService mailService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response testMail(){
        this.mailService.SendMail();       
        return Response.ok().build();
    }
    
}
