
package com.mycompany.progreso.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 *
 * @author Gabriel
 */

    @MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/mensaje")})

public class ConsumerService implements MessageListener{

    @Override
    public void onMessage(Message message) {

        try {
            ObjectMessage objectMessage = (ObjectMessage) message;
            
            System.out.println(objectMessage.getObject());
        } catch (JMSException ex) {
            Logger.getLogger(ConsumerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    
}
