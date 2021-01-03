
package com.mycompany.progreso.rq;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class CustomMsg implements Serializable{

private String title;
    
private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mensaje recibido: " + "title=" + title + ", content=" + content + '}';
    }

  
    

}
