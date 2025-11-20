package com.xworkz.webservice.external;

import com.xworkz.webservice.internal.User;

public class UserRunner {
    public static void main(String[] args) {
        User client = new User();

        System.out.println("Testing Username");
        client.validateUsername("siteadmin");

        System.out.println("Testing Password ");
        client.checkPassword("wrong_password");

        System.out.println(" Testing Account Status ");
        client.checkAccountStatus(true);

        System.out.println("Testing Permissions");
        client.checkPermissions("GUEST");

        System.out.println("Testing Session");
        client.checkSession(45);
    }
}
