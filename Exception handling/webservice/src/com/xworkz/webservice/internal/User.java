package com.xworkz.webservice.internal;

import com.xworkz.webservice.event.*;

public class User {

    public String validateUsername(String username) {
        if (username.toLowerCase().contains("admin")) {
            try {
                throw new InvalidUsernameException();
            } catch (InvalidUsernameException e) {
                e.printStackTrace();
                System.out.println("Handled: Username contains restricted words (e.g., 'admin').");
            }
        } else {
            System.out.println("Username " + username + " is valid.");
        }
        return username;
    }


    public String checkPassword(String inputPassword) {
        String storedPasswordHash = "hashed123";
        if (!inputPassword.equals("correct_password")) {
            try {
                throw new PasswordMismatchException();
            } catch (PasswordMismatchException e) {
                e.printStackTrace();
                System.out.println("Handled: The provided password does not match the stored credentials.");
            }
        } else {
            System.out.println("Password check successful.");
        }
        return inputPassword;
    }


    public boolean checkAccountStatus(boolean isLocked) {
        if (isLocked) {
            try {
                throw new AccountLockedException();
            } catch (AccountLockedException e) {
                e.printStackTrace();
                System.out.println("Handled: Account is locked due to multiple failed login attempts.");
            }
        } else {
            System.out.println("Account is active.");
        }
        return isLocked;
    }


    public String checkPermissions(String userRole) {
        if (userRole.equals("GUEST")) {
            try {
                throw new RolePermissionDeniedException();
            } catch (RolePermissionDeniedException e) {
                e.printStackTrace();
                System.out.println("Handled: User role (" + userRole + ") does not have permission to access this resource.");
            }
        } else {
            System.out.println("User role (" + userRole + ") has sufficient permissions.");
        }
        return userRole;
    }


    public int checkSession(int timeSinceLastActionMinutes) {
        if (timeSinceLastActionMinutes > 30) {
            try {
                throw new SessionTimeoutException();
            } catch (SessionTimeoutException e) {
                e.printStackTrace();
                System.out.println("Handled: Session timed out due to inactivity over 30 minutes.");
            }
        } else {
            System.out.println("Session is active (" + timeSinceLastActionMinutes + " minutes elapsed).");
        }
        return timeSinceLastActionMinutes;
    }
}
