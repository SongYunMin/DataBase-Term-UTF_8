package Controller;

import DAO.NewBusinessCardDAO;
import DTO.NewBusinessCardDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/NewBusinessCardServlet")
public class NewBusinessCardServlet extends HttpServlet {
    private NewBusinessCardDTO dto = new NewBusinessCardDTO();
    private NewBusinessCardDAO dao = new NewBusinessCardDAO();
    public static String globalCardNum;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        reqPro(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        reqPro(request, response);
    }

    protected void reqPro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        dto.setCardSignature(request.getParameter("NewBusinessCardCardSignature"));
        dto.setCardPhone(request.getParameter("NewBusinessCardCardPhone"));
        dto.setComName(request.getParameter("NewBusinessCardComName"));
        dto.setComPhone(request.getParameter("NewBusinessCardComPhone"));
        dto.setComDivision(request.getParameter("NewBusinessCardComDivision"));
        dto.setComPosition(request.getParameter("NewBusinessCardComPosition"));
        dto.setComAddress(request.getParameter("NewBusinessCardComAddress"));
        dto.setUserNum(IndexServlet.globalUserNum);
        String CardNum = request.getParameter("NewAccountPW");

        int result = dao.Business_register(dto);

        if(result == -1){
            System.out.println("DataBase Error!!");
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('DataBase Error!!'); " +
                    "location.href='MainPage.jsp';</script>");
            out.flush();
        }else{
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('새로운 명함을 생성했습니다.'); " +
                    "location.href='MainPage.jsp';</script>");
            out.flush();
        }

//        // Test Code

//        // RequestDispatcher : Send client requests to the desired resource
//        // forward : The role of handing control over to the target resource.
//        RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
//        dis.forward(request, response);

    }
}
