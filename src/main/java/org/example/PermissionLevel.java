package org.example;

public enum PermissionLevel {

    ADMIN("admin"),
    DEVELOPER("developer"),
    USER("user");

    private final String nameOfRole;

    // Constructor for enum
    PermissionLevel(String nameOfRole) {
        this.nameOfRole = nameOfRole;
    }

    public String getNameOfRole() {
        return nameOfRole;
    }

}
