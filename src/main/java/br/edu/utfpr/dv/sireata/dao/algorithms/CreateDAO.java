/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.dao.algorithms;

import br.edu.utfpr.dv.sireata.model.DAOEntity;

/**
 *
 * @author gabri
 */
public interface CreateDAO {
    public void create (DAOEntity e) throws Exception;
}
