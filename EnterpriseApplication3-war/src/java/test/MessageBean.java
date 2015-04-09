/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import test.Message;
/**
 *
 * @author Sudeera
 */
@ManagedBean(name="messageBean",eager=true)
@RequestScoped
public class MessageBean {
    
    
    @ManagedProperty(value="#{message}") 
    private Message messageView;
    private String message;
    private String name;
    private String movie;
    public MessageBean()
    {
        System.out.println("Hello World");
        System.out.println("Fast and Furious");
        System.out.println("Disney monkey kingdom");
    }
    
    public Message getMessageView() {
        return messageView;
    }

    public void setMessageView(Message messageView) {
        this.messageView = messageView;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    
    
    
}
