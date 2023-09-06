package com.coppel.dao;

import com.coppel.beans.RolBean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RolDao  extends ConnectionDao {
    public List<RolBean> getRol() {
        List<RolBean> ltRol = new ArrayList<>();
        try {
            conectar();
            PreparedStatement stmt = getCn().prepareStatement("SELECT * FROM  COPPEL.CAT_ROL");
            ResultSet rs = stmt.executeQuery();
            stmt.execute();
            while (rs.next()) {
                RolBean rol = new RolBean();
                rol.setRolId(Integer.valueOf(rs.getInt("ROL_ID")));
                rol.setRolName(rs.getString("ROL_NAME"));
                ltRol.add(rol);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return ltRol;
    }
}
