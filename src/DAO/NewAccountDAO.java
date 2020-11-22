package DAO;

import DTO.NewAccountDTO;

import java.sql.*;

public class NewAccountDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // DataBase Access
    public NewAccountDAO() {
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

//    public void close(){
//        try {
//            conn.close();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }

    public int register(NewAccountDTO dto){
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
