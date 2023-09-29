package org.example;

import org.junit.jupiter.api.Test;

import static org.example.PermissionLevel.ADMIN;
import static org.example.PermissionLevel.USER;
import static org.example.PermissionLevel.DEVELOPER;
import static org.junit.jupiter.api.Assertions.*;

class PermissionManagerTest {

    @Test
    void getPermissionLevel() {
        PermissionManager permissionManager = new PermissionManager();
        assertEquals("admin", permissionManager.getPermissionLevel(ADMIN));
    }

    @Test
    void getmCurrentLevel() {
        PermissionManager permissionManager = new PermissionManager();
        assertEquals(USER, permissionManager.getmCurrentLevel());
    }

    @Test
    void setmCurrentLevel() {
        PermissionManager permissionManager = new PermissionManager();
        permissionManager.setmCurrentLevel(DEVELOPER);
        assertEquals(DEVELOPER,permissionManager.getmCurrentLevel());
    }
}