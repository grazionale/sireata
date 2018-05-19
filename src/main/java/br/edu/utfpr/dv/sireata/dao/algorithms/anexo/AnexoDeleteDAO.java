/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.dao.algorithms.anexo;

import br.edu.utfpr.dv.sireata.dao.algorithms.DeleteDAO;
import br.edu.utfpr.dv.sireata.dao.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gabri
 */
public class AnexoDeleteDAO implements DeleteDAO {

    @Override
    public void excluir(int id) throws SQLException {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = ConnectionDAO.getInstance().getConnection();
            stmt = conn.createStatement();

            stmt.execute("DELETE FROM anexos WHERE idanexo=" + String.valueOf(id));
        } finally {
            if ((stmt != null) && !stmt.isClosed()) {
                stmt.close();
            }
            if ((conn != null) && !conn.isClosed()) {
                conn.close();
            }
        }
    }

}
