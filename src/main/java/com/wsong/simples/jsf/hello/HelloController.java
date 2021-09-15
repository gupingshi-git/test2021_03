package com.wsong.simples.jsf.hello;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "hello1111Controller")
@RequestScoped
public class HelloController implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    // ����һ������
    private String helloStr;
    
    private BigDecimal price;

    // ����get��set��������Ȼ���ܻ�ȡ���ñ���
    public String getHelloStr() {
	return helloStr;
    }

    public void setHelloStr(String helloStr) {
	this.helloStr = "test111"+helloStr;
    }
 
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // ���ò��Է���
    public void sayHello() {
	String showStr = "Hello : ";
	helloStr = showStr + helloStr;
    }
}
