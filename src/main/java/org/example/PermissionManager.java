package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {
        this.mCurrentLevel = PermissionLevel.USER;
    }

    public String getPermissionLevel (PermissionLevel permissionLevel){
        return permissionLevel.getNameOfRole();
    }

    public PermissionLevel getmCurrentLevel() {
        return this.mCurrentLevel;
    }

    public void setmCurrentLevel(PermissionLevel mCurrentLevel) {
        this.mCurrentLevel = mCurrentLevel;
    }

}
