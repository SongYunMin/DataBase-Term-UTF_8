package DAO;

import Controller.IndexServlet;
import DTO.NewBusinessCardDTO;

import java.sql.*;

public class MainPageDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // Database Access
    public MainPageDAO() {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/userinformation?serverTimezone=UTC";
            String dbID = "root";
            String dbPW = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPW);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int register(NewBusinessCardDTO dto) {
        String SQL = "SELECT cominfo.*, businesscard.CardSignature, businesscard.CardPhone FROM" +
                "cominfo INNER JOIN businesscard" +
                "ON cominfo.CardNum = businesscard.CardNum;";


        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println("");
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return-1;      // DataBase Error

}
}
