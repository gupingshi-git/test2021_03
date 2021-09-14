package com.wsong.simples.jsf.hello;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "hello")
@SessionScoped
public class HelloWorld implements java.io.Serializable {
    private static final long serialVersionUID = 2670923978809388476L;
    private String name;
    private BigDecimal price;
    public String getName() {
	if (this.name == null) {
	    return "World";
	}
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    
}