/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.richa.latihanmvcdjbc.main;

import edu.richa.latihanmvcdjbc.database.KingBarbershopDatabase;
import edu.richa.latihanmvcdjbc.entity.Pelanggan;
import edu.richa.latihanmvcdjbc.error.PelangganException;
import edu.richa.latihanmvcdjbc.service.PelangganDao;
import edu.richa.latihanmvcdjbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author detun-nuist
 */
public class Latihan6CRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(Latihan6CRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
