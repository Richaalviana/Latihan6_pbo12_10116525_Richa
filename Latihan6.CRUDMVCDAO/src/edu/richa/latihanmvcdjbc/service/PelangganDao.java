/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.richa.latihanmvcdjbc.service;

import edu.richa.latihanmvcdjbc.entity.Pelanggan;
import edu.richa.latihanmvcdjbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author detun-nuist
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan)throws PelangganException;
    public void updatePelanggan(Pelanggan pelanggan)throws PelangganException;
    public void deletePelanggan(Integer id)throws PelangganException;
    public Pelanggan getpePelanggan(Integer id)throws PelangganException;
    public Pelanggan getpPelanggan(String email)throws PelangganException;
    public List<Pelanggan> selectAllpePelanggan() throws PelangganException;
}

    
