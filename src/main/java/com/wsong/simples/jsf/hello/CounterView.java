package com.wsong.simples.jsf.hello;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "counterView")
@ViewScoped
public class CounterView implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int number;

    public int getNumber() {
	return number;
    }

    public void increment() {
	number++;
    }
}