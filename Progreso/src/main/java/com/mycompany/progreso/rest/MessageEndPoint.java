package com.mycompany.progreso.rest;

import com.mycompany.progreso.rq.CustomMsg;
import com.mycompany.progreso.service.ProducerService;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Gabriel
 */
@Path("/messages")
public class MessageEndPoint {
    
    @Inject
    private ProducerService producerService;
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response CreateMessage(CustomMsg customMsg){
        
        //this.producerService.CreateMessage(customMsg);
        
        return Response.ok().build();
    }
    
}
