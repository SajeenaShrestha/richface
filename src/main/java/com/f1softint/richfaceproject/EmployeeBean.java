/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softint.richfaceproject;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author User
 */
@ManagedBean(name = "employeeBean")
@SessionScoped
public class EmployeeBean implements Serializable {

    private static final long serialiersionUID = 1L;

    private List<Employee> list;
    private Employee emp = new Employee();
    private Employee beforeEditEmp = null;
    private boolean edit;
    private List<DeletedEmployee> deletedList;
    private DeletedEmployee delEmp = new DeletedEmployee();
    private String reason1;

    public String getReason1() {
        return reason1;
    }

    public void setReason1(String reason1) {
        this.reason1 = reason1;
    }
    
   
//    private boolean java=false;
    //private boolean python=false;
    public DeletedEmployee getDelEmp() {
        return delEmp;
    }
   

    @PostConstruct
    public void init() {
        list = new ArrayList<Employee>();
        deletedList=new ArrayList<DeletedEmployee>();
    }
    
    public String addEmployee() {
        // DAO save the add
        emp.setSn(list.isEmpty() ? 1 : list.get(list.size() - 1).getSn() + 1);
        list.add(emp);
        emp = new Employee();
        return "index";
    }

    public void resetAdd() {
        emp = new Employee();
    }

    public List<DeletedEmployee> getDeletedList() {
        return deletedList;
    }

    public String editEmployee(Employee emp) {
        beforeEditEmp = emp.clone();
        this.emp = emp;
        edit = true;
        return "edit";
    }

    public void cancelEdit() {
        this.emp.restore(beforeEditEmp);
        this.emp = new Employee();
        edit = false;
    }

    public String saveEditEmployee() {
        // DAO save the edit
        this.emp = new Employee();
        edit = false;
        return "view";
    }

    public void deleteEmployee(Employee emp) throws IOException {
        // DAO save the delete
        System.out.println("delete employee module");
        list.remove(emp);
        //DeletedEmployee delEmployee = new DeletedEmployee();
        delEmp.setEmployee(emp);
        delEmp.setReason(reason1);
        deletedList.add(delEmp);
        delEmp = new DeletedEmployee();
    }
//    public void addReason(){
//        
//    }

    public String delete(DeletedEmployee delEmp) throws IOException {
        // DAO save the delete
        deletedList.remove(delEmp);
        return "view";
    }

    public List<Employee> getList() {
        return list;
    }

    public Employee getEmp() {
        return this.emp;
    }

    public boolean isEdit() {
        return this.edit;
    }
    
    public boolean isJava(){
        System.out.println("Java Printed");
        System.out.println("GetExpertise" + emp.getExpertise());
        if (emp.getExpertise().equalsIgnoreCase("java")) {
           return true;

        }
      return false;
    }
    
    public boolean isPython(){
        System.out.println("Python Printed");
        System.out.println("GetExpertise" + emp.getExpertise());
        if (emp.getExpertise().equalsIgnoreCase("python")) {
           return true;
        }
      return false;
    }
    
    public boolean isCss(){
        System.out.println("Css Printed");
        System.out.println("GetExpertise" + emp.getExpertise());
        if (emp.getExpertise().equalsIgnoreCase("css")) {
           return true;
        }
      return false;
    }
    
   
   
    public boolean isPhp(){
        System.out.println("php Printed");
        if (emp.getExpertise().equalsIgnoreCase("php")){
            return true;
        }
        return false;
    }

//    public boolean isJava() {
//        return java;
//    }
//     public boolean isPython() {
//        return python;
//    }
//
//    public void setJava(boolean java) {
//        this.java = java;
//    }
//
//    public void setPython(boolean python) {
//        this.python = python;
//    }
//    

}
