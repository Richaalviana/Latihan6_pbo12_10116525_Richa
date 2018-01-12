/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.richa.latihanmvcdjbc.event;

import edu.richa.latihanmvcdjbc.entity.Pelanggan;
import edu.richa.latihanmvcdjbc.model.PelangganModel;

/**
 *
 * @author detun-nuist
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);

    
}
