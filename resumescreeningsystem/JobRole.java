package com.tit.resumescreeningsystem;

abstract class JobRole {
    protected String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
    abstract public boolean selectionResult();
}
