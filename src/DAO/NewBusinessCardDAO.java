package DAO;

import Controller.IndexServlet;
import Controller.NewBusinessCardServlet;
import DTO.NewAccountDTO;
import DTO.NewBusinessCardDTO;

import java.sql.*;

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

    public int Business_register(NewBusinessCardDTO dto) {
        String SQL = "INSERT INTO businesscard(CardNum, UserNum, CardSignature, CardPhone) " +
                "VALUES(default ,?,?,?)";
        try {
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, IndexServlet.globalUserNum);
            pstmt.setString(2, dto.getCardSignature());
            pstmt.setString(3, dto.getCardPhone());
            pstmt.executeUpdate();
            CardNumSelect(dto);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;      // DataBase Error
    }

    public int CardNumSelect(NewBusinessCardDTO dto) {
        String SQL = "SELECT CardNum FROM businesscard ORDER BY CardNum;";
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            rs.first();
            while (rs.next()) {
                NewBusinessCardServlet.globalCardNum = rs.getString("CardNum");
            }
            ComInfo_register(dto);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }


    public int ComInfo_register(NewBusinessCardDTO dto) {
        String SQL = "INSERT INTO cominfo(ComNum, ComName, CardNum, ComAddress, " +
                "ComPhone, ComDivision, ComPosition, UserNum) " +
                "VALUES(default,?,?,?,?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, dto.getComName());
            pstmt.setString(2, NewBusinessCardServlet.globalCardNum);
            pstmt.setString(3, dto.getComAddress());
            pstmt.setString(4, dto.getComPhone());
            pstmt.setString(5, dto.getComDivision());
            pstmt.setString(6, dto.getComPosition());
            pstmt.setString(7, IndexServlet.globalUserNum);
            pstmt.executeUpdate();
            int buf = Integer.parseInt(NewBusinessCardServlet.globalCardNum);
            buf++;
            NewBusinessCardServlet.globalCardNum = Integer.toString(buf);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;      // DataBase Error
    }
}
