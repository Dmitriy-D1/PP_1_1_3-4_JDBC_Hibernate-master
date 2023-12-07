package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь


        UserServiceImpl userService = new UserServiceImpl(new UserDaoHibernateImpl());

        userService.createUsersTable();

        userService.saveUser("Eric", "Cartman", (byte) 10);
        userService.saveUser("Kyle", "Broflovski", (byte) 10);
        userService.saveUser("Stan", "Marsh", (byte) 10);
        userService.saveUser("Kenny", "McCormick", (byte) 10);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
