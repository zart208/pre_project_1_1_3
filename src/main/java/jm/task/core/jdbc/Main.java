package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 43);
        userService.saveUser("Petr", "Petrov", (byte) 35);
        userService.saveUser("Sidor", "Sidorov", (byte) 28);
        userService.saveUser("Aleksandr", "Aleksandrov", (byte) 51);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
