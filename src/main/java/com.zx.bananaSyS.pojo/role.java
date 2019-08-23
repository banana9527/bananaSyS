package com.zx.bananaSyS.pojo;

/**
 * @auther mike
 * @create 2019-07-24 16:39
 */
public class role {
    private int roleId;
    private String roleName;
    private String roleDesc;
    private String role;
    private permission permition;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public permission getPermition() {
        return permition;
    }

    public void setPermition(permission permition) {
        this.permition = permition;
    }
}
