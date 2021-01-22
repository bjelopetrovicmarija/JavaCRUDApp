/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

/**
 *
 * @author Dell
 */
public class Procenat implements SQLData {

    private String sql_type;
    public int proc;

    public Procenat() {
    }

    public Procenat(String sql_type, int proc) {
        this.sql_type = sql_type;
        this.proc = proc;
    }

    @Override
    public String getSQLTypeName() throws SQLException {

        return sql_type;
    }

    @Override
    public void readSQL(SQLInput stream, String typeName) throws SQLException {

        sql_type = typeName;
        proc = stream.readInt();

    }

    @Override
    public void writeSQL(SQLOutput stream) throws SQLException {

        stream.writeInt(proc);

    }

    @Override
    public String toString() {
        return proc+"";
    }
    

}
