package DAO;

import DTO.NewAccountDTO;
import DTO.NewBusinessCardDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NewBusinessCardDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // DataBase Access
    public NewBusinessCardDAO() {
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

    public int Business_register(NewBusinessCardDTO dto){
        String SQL = "INSERT INTO businesscard(CardNum, UserNum, CardSignature, CardPhone) " +
                "VALUES(default ,?,?,?)";
        try{
            pstmt=conn.prepareStatement(SQL);
            pstmt.setString(1,dto.getUserNum());
            pstmt.setString(2,dto.getCardSignature());
            pstmt.setString(3,dto.getCardPhone());
            return pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;      // DataBase Error
    }
}
