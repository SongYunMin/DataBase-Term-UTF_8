package Controller;

import DAO.MainPageDAO;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Annotation Mapping
@WebServlet("/MainPageServlet")
public class MainPageServlet extends HttpServlet {
    private MainPageDAO dao = new MainPageDAO();

    public MainPageServlet() {
        super();
    }

    // Servlet Class 가 GET 으로 호출되는 경우 doGet Method 를 Override
    // 기본 규칙에 따라 작성
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create Processing Content
        reqPro(request, response);
    }

    // Servlet Class 가 POST 로 호출 되는 경우 doGet Method 를 Override
    // 기본 규칙에 따라 작성
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create Processing Content
        reqPro(request, response);

    }

    protected void reqPro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int result = dao.BusinessCardRegister();
        if (result == -1) {
            System.out.println("DataBase Error");
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('예기치 못한 오류가 발생했습니다.'); " +
                    "location.href='index.jsp';</script>");
            out.flush();
        } else {
            request.setAttribute("BusinessCardCardSignature", MainPageDAO.cardSignatureList);
            request.setAttribute("BusinessCardCardPhone", MainPageDAO.cardPhoneList);
            request.setAttribute("ComInfoComName", MainPageDAO.comNameList);
            request.setAttribute("ComInfoComAddress", MainPageDAO.comAddressList);
            request.setAttribute("ComInfoComPhone", MainPageDAO.comPhoneList);
            request.setAttribute("ComInfoComDivision", MainPageDAO.comDivisionList);
            request.setAttribute("ComInfoComPosition", MainPageDAO.comPositionList);
            RequestDispatcher dis = request.getRequestDispatcher("MainPage.jsp");
            dis.forward(request, response);
        }
    }
}
