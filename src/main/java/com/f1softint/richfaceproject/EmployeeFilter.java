/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softint.richfaceproject;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author User
 */
@ManagedBean (name="employeeFilter")
@ViewScoped
public class EmployeeFilter implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long idFilter;
    private String nameFilter;
    private String addressFilter;
    private String emailFilter;
    private String mobileFilter;
    private String expertiseFilter;
    private String subExpertiseFilter;

    public Long getIdFilter() {
        return idFilter;
    }

    public void setIdFilter(Long idFilter) {
        this.idFilter = idFilter;
    }

    public String getNameFilter() {
        return nameFilter;
    }

    public void setNameFilter(String nameFilter) {
        this.nameFilter = nameFilter;
    }

    public String getAddressFilter() {
        return addressFilter;
    }

    public void setAddressFilter(String addressFilter) {
        this.addressFilter = addressFilter;
    }

    public String getEmailFilter() {
        return emailFilter;
    }

    public void setEmailFilter(String emailFilter) {
        this.emailFilter = emailFilter;
    }

    public String getMobileFilter() {
        return mobileFilter;
    }

    public void setMobileFilter(String mobileFilter) {
        this.mobileFilter = mobileFilter;
    }

    public String getExpertiseFilter() {
        return expertiseFilter;
    }

    public void setExpertiseFilter(String expertiseFilter) {
        this.expertiseFilter = expertiseFilter;
    }

    public String getSubExpertiseFilter() {
        return subExpertiseFilter;
    }

    public void setSubExpertiseFilter(String subExpertiseFilter) {
        this.subExpertiseFilter = subExpertiseFilter;
    }

      public EmployeeFilter() {
    }

    public EmployeeFilter(Long idFilter, String nameFilter, String addressFilter, String emailFilter, String mobileFilter, String expertiseFilter, String subExpertiseFilter) {
        this.idFilter = idFilter;
        this.nameFilter = nameFilter;
        this.addressFilter = addressFilter;
        this.emailFilter = emailFilter;
        this.mobileFilter = mobileFilter;
        this.expertiseFilter = expertiseFilter;
        this.subExpertiseFilter = subExpertiseFilter;
    }
      
    
    
}
