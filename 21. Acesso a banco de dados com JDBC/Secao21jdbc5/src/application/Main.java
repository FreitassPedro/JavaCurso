package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "Delete FROM department "
                    + "WHERE "
                    + "Id = ?");
            st.setInt(1 , 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows Affected: " + rowsAffected);
        }
        catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatements(st);
            DB.closeConnection();
        }
        }
    }