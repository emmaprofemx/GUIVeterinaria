/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudprincesa;

/**
 *
 * @author EMMANUEL
 */
import javax.swing.JFrame;

public class WindowUtils {

    public static void close(JFrame frame) {
        if (frame != null) {
            frame.dispose();
        }
    }
}
