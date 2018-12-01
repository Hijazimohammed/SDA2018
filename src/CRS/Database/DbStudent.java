/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import CRS.AppLogic.Student;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class DbStudent {
    private Statement aStatement;
    public void addStudent(Student aStudent){
        DbConnection aDbConnection = DbConnection.getDbConnection();
        try {
            aStatement = aDbConnection.getStatement();
            String sql="Insert Into students(name,major,grade)" +
                    "Values('" + aStudent.getName() + "','"+
                    aStudent.getMajor()+ "',"+
                    aStudent.getGrade() +")";
            aStatement.executeUpdate(sql);
        } catch (Exception ex) {
            Logger.getLogger(DbStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
