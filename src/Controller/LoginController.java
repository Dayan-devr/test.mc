/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.UserDAO;
import Model.User;

/**
 *
 * @author USER
 */
public class LoginController {
    
    private final UserDAO userDAO;

    public LoginController() {
        userDAO = new UserDAO();
    }

    public User login(String username, String password) {

        // Basic validation
        if (username == null || username.trim().isEmpty()) {
            return null;
        }

        if (password == null || password.trim().isEmpty()) {
            return null;
        }

        return userDAO.login(username.trim(), password);
    }
    
}
