package DAO;

import DTO.IndexDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IndexDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // DataBase Access
    public IndexDAO() {
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

    public int register(IndexDTO dto){
        String SQL = "SELECT UserID, UserPW FROM userinfo;";
        String bufID;
        String bufPW;
        int i = 0;
        try{
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            i = 0;
            while(rs.next()){
                System.out.println("ID : " + rs.getString("UserID") +
                        "PW : " + rs.getString("UserPW"));
                bufID = rs.getString("UserID");
                bufPW = rs.getString("UserPW");
                if(bufID.equals(dto.getUserID()) && bufPW.equals(dto.getUserPW())){
                    return 1;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;      // DataBase Error
    }

//    public int UserNumRegister(IndexDTO dto){
//
//    }
}
