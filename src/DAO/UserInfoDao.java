package DAO;

import DTO.UserInfoDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserInfoDao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // DataBase Access
    public UserInfoDao() {
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

    public int register(UserInfoDto dto){
        String SQL = "INSERT INTO userinfo(UserNum, UserName, UserID, UserPW) VALUES(default ,?,?,?)";
        try{
            pstmt=conn.prepareStatement(SQL);
            pstmt.setString(1,dto.getUserName());
            pstmt.setString(2,dto.getUserID());
            pstmt.setString(3,dto.getUserPW());
            return pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

        return -1;      // DataBase Error
    }

}
