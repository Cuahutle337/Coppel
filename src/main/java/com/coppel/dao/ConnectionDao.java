package com.coppel.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;

public class ConnectionDao {
    private Connection cn;

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Connection getCn() {
        return this.cn;
    }

    public void conectar() {
        try {
            DriverManager.registerDriver((Driver)new OracleDriver());
            this.cn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1", "system", "20Etaniae1987");
        } catch (Exception e) {
            System.out.println("Error en la conexide la base de datos");
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (this.cn != null &&
                    !this.cn.isClosed())
                this.cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
