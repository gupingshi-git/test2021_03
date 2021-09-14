package com.wsong.simples.jsf.hello;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "userView")
public class UserView {

    private String firstname;
    private String lastname;

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public void save() {
	FacesContext.getCurrentInstance().addMessage("firstname", new FacesMessage("Welcome " + firstname + " " + lastname));
    }
}