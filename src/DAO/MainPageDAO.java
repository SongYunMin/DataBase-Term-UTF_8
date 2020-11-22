package DAO;

import Controller.IndexServlet;
import DTO.NewBusinessCardDTO;

import java.sql.*;
import java.util.ArrayList;

public class MainPageDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    // 출력 대상 리스트
    ArrayList<String> cardSignatureList = new ArrayList<>();
    ArrayList<String> cardPhoneList = new ArrayList<>();
    ArrayList<String> comNameList = new ArrayList<>();
    ArrayList<String> comAddressList = new ArrayList<>();
    ArrayList<String> comPhoneList = new ArrayList<>();
    ArrayList<String> comDivisionList = new ArrayList<>();
    ArrayList<String> comPositionList = new ArrayList<>();

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

        String SQL = "SELECT cominfo.*, nusinesscard.CardSignature, businesscard.CardPhone FROM" +
                "cominfo INNER JOIN businesscard" +
                "ON cominfo.UserNum = businesscard.UserNum;";

        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                /* TEST CODE */
                System.out.println("-------BUSINESS CARD TABLE-------");
                System.out.println("CardNum : " + rs.getString("CardNum"));
                System.out.println("UserNum : " + rs.getString("UserNUm"));
                System.out.println("CardSignature : " + rs.getString("CardSignature"));
                System.out.println("CardPhone : " + rs.getString("CardPhone"));
                System.out.println("-------ComInfo TABLE-------");
                System.out.println("ComNum : " + rs.getString("CardNum"));
                System.out.println("ComName : " + rs.getString("ComName"));
                System.out.println("CardNum : " + rs.getString("CardNum"));
                System.out.println("ComAddress : " + rs.getString("ComAddress"));
                System.out.println("ComPhone : " + rs.getString("ComPhone"));
                System.out.println("ComDivision : " + rs.getString("ComDivision"));
                System.out.println("ComPosition : " + rs.getString("ComPosition"));
                System.out.println("UserNum : " + rs.getString("UserNum"));
                /* END */


                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return-1;      // DataBase Error

}
}
