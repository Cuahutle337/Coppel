package com.coppel.beans;

import oracle.sql.TIMESTAMP;

public class RolBean {
    private Integer rolId;

    private String rolName;

    private TIMESTAMP creationDate;

    private TIMESTAMP modificationDate;

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public void setCreationDate(TIMESTAMP creationDate) {
        this.creationDate = creationDate;
    }

    public void setModificationDate(TIMESTAMP modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Integer getRolId() {
        return this.rolId;
    }

    public String getRolName() {
        return this.rolName;
    }

    public TIMESTAMP getCreationDate() {
        return this.creationDate;
    }

    public TIMESTAMP getModificationDate() {
        return this.modificationDate;
    }
}
