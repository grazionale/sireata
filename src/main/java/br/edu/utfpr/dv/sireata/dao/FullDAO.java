/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.CreateDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.DeleteDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ReadDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.UpdateDAO;
import br.edu.utfpr.dv.sireata.model.Anexo;
import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;
import java.util.Set;

/**
 *
 * @author gabri
 */
public abstract class FullDAO {
    protected CreateDAO create;
    protected ReadDAO read;
    protected UpdateDAO update;
    protected DeleteDAO delete;

    public void create (DAOEntity e) throws Exception {
        create.create(e);
    }
   
    public Set<? extends DAOEntity> readAll() {
        return read.readAll();
    }
    
    public void update(DAOEntity newEntity, String value) {
        update.update(newEntity, value);
    }
    
    public void excluir(int value) throws SQLException {
        delete.excluir(value);
    }    
}
