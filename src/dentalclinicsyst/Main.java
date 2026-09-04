/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dentalclinicsyst;

import View.Login;
import javax.swing.SwingUtilities;

/**
 *
 * @author USER
 */

    
   



public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        });
    }
}
    

