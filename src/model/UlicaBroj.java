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
public class UlicaBroj implements SQLData {
    
    private String sql_type;
    public int broj;
    public String dodatakBroju;
    
    public UlicaBroj() {
    }
    
    public UlicaBroj(String sql_type, int broj, String dodatakBroju) {
        this.sql_type = sql_type;
        this.broj = broj;
        this.dodatakBroju = dodatakBroju;
    }
    
    @Override
    public String getSQLTypeName() throws SQLException {
        
        return sql_type;
    }
    
    @Override
    public void readSQL(SQLInput stream, String typeName) throws SQLException {
        
        sql_type = typeName;
        broj = stream.readInt();
        dodatakBroju = stream.readString();
        
    }
    
    @Override
    public void writeSQL(SQLOutput stream) throws SQLException {
        stream.writeInt(broj);
        stream.writeString(dodatakBroju);
        
    }

    @Override
    public String toString() {
        return broj+" "+dodatakBroju;
    }
    
    
    
    
}
