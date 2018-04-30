package com.f1softint.richfaceproject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
@ManagedBean(name="adminBean")
@RequestScoped
public class AdminBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String password;

    public AdminBean() {
    }

    public AdminBean(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String verifyAdmin() {

        System.out.println("Name" + name);
        System.out.println("Password:" + password);
        System.out.println("DIGIT"+5+2);
        System.out.println(5+2+"Digit");
        
        Map<String, String> adminMap = new HashMap<>();
        adminMap.put("SAJEENA", "sajeena");
        adminMap.put("RACHANA", "rachana");

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, String> mEntry : adminMap.entrySet()) {
            System.out.println("Key = " + mEntry.getKey() + ", Value = " + mEntry.getValue());
            if (name.equalsIgnoreCase(mEntry.getKey()) && (password.equals(mEntry.getValue()))) {
                //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sample info message", "PrimeFaces rocks!"));
                return "index";
            } 
        }
        return "login";

    }

}

