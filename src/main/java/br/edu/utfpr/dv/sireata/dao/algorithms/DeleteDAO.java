/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.dao.algorithms;

import java.sql.SQLException;

/**
 *
 * @author gabri
 */
public interface DeleteDAO {
    public void excluir(int id) throws SQLException;
}
