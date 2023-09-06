package com.coppel.beans;

import com.coppel.dao.EmployeeDao;
import com.coppel.dao.RolDao;
import com.coppel.model.Employee;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
@Getter
@Setter
public class EmployeeBean implements Serializable {
    private Employee employee;

    private RolDao rol;

    private List<RolBean> ltRol;





    @PostConstruct
    public void init() {
        this.employee = new Employee();
        this.rol = new RolDao();
        this.ltRol = this.rol.getRol();
    }

    public void createEmployee() {
        try {
            EmployeeDao empDao = new EmployeeDao();
            empDao.createEmployee(this.employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
