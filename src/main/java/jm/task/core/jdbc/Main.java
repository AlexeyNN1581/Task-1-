package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        System.out.println("-------");

        userService.saveUser("Vladimer", "Popov", (byte) 20);
        userService.saveUser("Misha", "Vovochkin", (byte) 43);
        userService.saveUser("Dima", "Petrov", (byte) 28);
        userService.saveUser("Kira", "Vaselkova", (byte) 65);
        System.out.println("-------");

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("-------");

        userService.removeUserById(1);
        System.out.println("-------");

        userService.cleanUsersTable();
        System.out.println("-------");

        userService.dropUsersTable();
        System.out.println("-------");
    }
}

// реализуйте алгоритм здесь

