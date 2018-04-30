/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softint.richfaceproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.faces.model.SelectItem;

/**
 *
 * @author User
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    public void Employee() {

    }
    private Long sn;
    private Long id;

    private String name;
    private String address;
    private String email;
    private String mobile;
    private String expertise;
    private List<String> subExpertise;

    public List<String> getSubExpertise() {
        return subExpertise;
    }

    public void setSubExpertise(List<String> subExpertise) {
        this.subExpertise = subExpertise;
    }

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public Map<String, String> getExpertiseValue() {
        Map<String, String> expertiseValue = new LinkedHashMap<>();
        expertiseValue.put("JAVA", "java"); //label, value
        expertiseValue.put("PYTHON", "python");
        expertiseValue.put("PHP", "php");
        expertiseValue.put("CSS", "css");
        return expertiseValue;
    }

    public List<SelectItem> getSelectItemValue() {
        Map<String, String> epertiseMap = getExpertiseValue();

        List<SelectItem> selectItems = new ArrayList<>();
        Iterator itr = epertiseMap.entrySet().iterator();
        while (itr.hasNext()) {
            Entry thisEntry = (Entry) itr.next();
            String key = (String) thisEntry.getKey();
            String value = (String) thisEntry.getValue();

            SelectItem selectItem = new SelectItem();
            selectItem.setLabel(key);
            selectItem.setValue(value);
            selectItems.add(selectItem);

        }

        return selectItems;
    }

    public Map<String, String> getSubExpertiseJava() {
        Map<String, String> subExpertiseJava = new LinkedHashMap<>();
        subExpertiseJava.put("JAVA-1", "java1"); //label, value
        subExpertiseJava.put("JAVA-2", "java2");
        subExpertiseJava.put("JAVA-3", "java3");
        return subExpertiseJava;
    }

    public Map<String, String> getSubExpertisePython() {
        Map<String, String> subExpertisePython = new LinkedHashMap<>();
        subExpertisePython.put("PYTHON-1", "python1"); //label, value
        subExpertisePython.put("PYTHON-2", "python2");
        subExpertisePython.put("PYTHON-3", "python3");
        return subExpertisePython;
    }

    public Map<String, String> getSubExpertiseCss() {
        Map<String, String> subExpertiseCss = new LinkedHashMap<>();
        subExpertiseCss.put("CSS-1", "css1"); //label, value
        subExpertiseCss.put("CSS-2", "css2");
        subExpertiseCss.put("CSS-3", "css3");
        return subExpertiseCss;
    }

    public Map<String, String> getSubExpertisePhp() {
        Map<String, String> subExpertisePhp = new LinkedHashMap<>();
        subExpertisePhp.put("PHP-1", "php1"); //label, value
        subExpertisePhp.put("PHP-2", "php2");
        subExpertisePhp.put("PHP-3", "php3");
        return subExpertisePhp;
    }

    @Override
    public Employee clone() {
        return new Employee();
    }

    public void restore(Employee employee) {
        this.sn = employee.getSn();
        this.id = employee.getId();
        this.name = employee.getName();
        this.address = employee.getAddress();
        this.email = employee.getEmail();
        this.mobile = employee.getMobile();
        this.expertise = employee.getExpertise();
        this.subExpertise = employee.getSubExpertise();
    }

}
