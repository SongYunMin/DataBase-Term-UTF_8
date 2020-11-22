package DAO;

import Controller.IndexServlet;

import java.sql.*;
import java.util.ArrayList;

public class MainPageDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    // 출력 대상 리스트
    public static ArrayList<String> cardSignatureList = new ArrayList<>();
    public static ArrayList<String> cardPhoneList = new ArrayList<>();
    public static ArrayList<String> comNameList = new ArrayList<>();
    public static ArrayList<String> comAddressList = new ArrayList<>();
    public static ArrayList<String> comPhoneList = new ArrayList<>();
    public static ArrayList<String> comDivisionList = new ArrayList<>();
    public static ArrayList<String> comPositionList = new ArrayList<>();

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

    public int BusinessCardRegister() {
//        String SQL = "SELECT cominfo.*, nusinesscard.CardSignature, businesscard.CardPhone FROM" +
//                "cominfo INNER JOIN businesscard" +
//                "ON cominfo.UserNum = businesscard.UserNum;";
        String SQL = "SELECT CardSignature, CardPhone FROM " +
                "businesscard WHERE UserNum = " + IndexServlet.globalUserNum;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                /* TEST CODE */
                System.out.println("-------BUSINESS CARD TABLE-------");
//                System.out.println("CardNum : " + rs.getString("CardNum"));
//                System.out.println("UserNum : " + rs.getString("UserNUm"));
                System.out.println("CardSignature : " + rs.getString("CardSignature"));
                System.out.println("CardPhone : " + rs.getString("CardPhone"));
                cardSignatureList.add(rs.getString("CardSignature"));
                cardPhoneList.add(rs.getString("CardPhone"));
                /* END */
            }
            ComInfoRegister();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;      // DataBase Error
    }

    public int ComInfoRegister() {
        String SQL = "SELECT ComName, ComAddress, ComPhone, ComDivision, ComPosition FROM cominfo WHERE UserNum = "
                + IndexServlet.globalUserNum;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()) {
                System.out.println("-------ComInfo TABLE-------");
                System.out.println("ComName : " + rs.getString("ComName"));
//                System.out.println("CardNum : " + rs.getString("CardNum"));
                System.out.println("ComAddress : " + rs.getString("ComAddress"));
                System.out.println("ComPhone : " + rs.getString("ComPhone"));
                System.out.println("ComDivision : " + rs.getString("ComDivision"));
                System.out.println("ComPosition : " + rs.getString("ComPosition"));
//                System.out.println("UserNum : " + rs.getString("UserNum"));
                comNameList.add(rs.getString("ComName"));
                comAddressList.add(rs.getString("ComAddress"));
                comPhoneList.add(rs.getString("ComPhone"));
                comDivisionList.add(rs.getString("ComDivision"));
                comPositionList.add(rs.getString("ComPosition"));
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
