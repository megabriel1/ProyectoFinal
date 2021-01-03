
package com.mycompany.progreso.service;

import com.mycompany.progreso.classes.Regiones;
import com.mycompany.progreso.classes.RegionesHistorico;
import com.mycompany.progreso.classes.RegionesHistorico_1;
import com.mycompany.progreso.rq.CustomMsg;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;

/**
 *
 * @author Gabriel
 */
@RequestScoped
public class ProducerService {

    @Resource(mappedName = "java:/jms/queue/mensaje")
    private Queue messageQueue;
    
    @Resource(mappedName = "java:/ConnectionFactory")
    private ConnectionFactory connection;  
    
public void CreateMessage(Regiones regiones){    
    
    JMSContext context = connection.createContext();
            
            JMSProducer producer = context.createProducer();
    
            producer.send(messageQueue, regiones);
                    
            
}

public void CreateMessage2(RegionesHistorico_1 regionesHistorico){    
    
    JMSContext context = connection.createContext();
            
            JMSProducer producer = context.createProducer();
    
            producer.send(messageQueue, regionesHistorico);
                    
            
}

    
}
