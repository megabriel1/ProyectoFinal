
package com.mycompany.progreso.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Gabriel
 */
@Stateless
public class MailService {
 
    @Resource(mappedName = "java:/jboss/mail/alf")
    private Session session;
    
    @Asynchronous
    public void SendMail(){
               
        try {
                        
            String email="mariobatres7@shekalug.org";
                        
            String content="<h3>Puede acceder a la base de datos a traves del siguiente link: "
                    + "http://localhost:8081/Progreso-1.0-SNAPSHOT/sendero/rest/ .</h3>";            
            
            MimeMessage message=new MimeMessage(session);
            message.setHeader("content-Type", "text/html;charset=UTF-8");
            
            message.setFrom(new InternetAddress("edson_gabriel007@hotmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("La base de datos Regiones ha sido consultada.", "UTF-8");
            
            message.setContent(content, "text/html;charset=UTF-8");
            
            Transport.send(message);
            
        } catch (MessagingException ex) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Asynchronous
    public void SendMail2(){
               
        try {
                        
            String email="mariobatres7@shekalug.org";
                        
            String content="<h3>Para revisar la informacion ingresada puede acceder "
                    + " a la base de datos a traves del siguiente link: http://localhost:8081/Progreso-1.0-SNAPSHOT/sendero/rest/ </h3>";            
            
            MimeMessage message=new MimeMessage(session);
            message.setHeader("content-Type", "text/html;charset=UTF-8");
            
            message.setFrom(new InternetAddress("edson_gabriel007@hotmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Información ha sido ingresada a la base de datos Regiones.", "UTF-8");
            
            message.setContent(content, "text/html;charset=UTF-8");
            
            Transport.send(message);
            
        } catch (MessagingException ex) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Asynchronous
    public void SendMail3(){
               
        try {
                        
            String email="mariobatres7@shekalug.org";
                        
            String content="<h3>Para revisar los cambios realizados puede acceder "
                    + " a la base de datos a traves del siguiente link: http://localhost:8081/Progreso-1.0-SNAPSHOT/sendero/rest/ </h3>";
            
            MimeMessage message=new MimeMessage(session);
            message.setHeader("content-Type", "text/html;charset=UTF-8");
            
            message.setFrom(new InternetAddress("edson_gabriel007@hotmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("La base de datos Regiones ha sido modificada.", "UTF-8");
            
            message.setContent(content, "text/html;charset=UTF-8");
            
            Transport.send(message);
            
        } catch (MessagingException ex) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Asynchronous
    public void SendMail4(){
               
        try {
                        
            String email="mariobatres7@shekalug.org";
                        
            String content="<h3>Puede acceder a la base de datos "
                    + " a traves del siguiente link: http://localhost:8081/Progreso-1.0-SNAPSHOT/sendero/rest/ </h3>";
            
            MimeMessage message=new MimeMessage(session);
            message.setHeader("content-Type", "text/html;charset=UTF-8");
            
            message.setFrom(new InternetAddress("edson_gabriel007@hotmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Información ha sido borrada.", "UTF-8");
            
            message.setContent(content, "text/html;charset=UTF-8");
            
            Transport.send(message);
            
        } catch (MessagingException ex) {
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
