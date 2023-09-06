package com.coppel.dao;

import com.coppel.model.Employee;

import java.sql.CallableStatement;

public class EmployeeDao extends ConnectionDao {
    public void createEmployee(Employee em) {
        try {
            this.conectar();
            CallableStatement cst = getCn().prepareCall("{call COPPEL.createEmployee (?,?,?,?)}");
            cst.setInt(1, Integer.parseInt(em.getEmployeeNumber()));
            cst.setString(2, em.getName());
            cst.setInt(3, em.getRolId().intValue());
            cst.setInt(4, em.getEmployeeType().intValue());
            cst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConnection();
        }
    }
}
