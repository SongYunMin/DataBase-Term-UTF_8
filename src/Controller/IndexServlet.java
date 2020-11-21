package Controller;

import DAO.IndexDAO;
import DTO.IndexDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
    private IndexDAO dao = new IndexDAO();
    private IndexDTO dto = new IndexDTO();
    public static String globalUserNum;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        reqPro(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        reqPro(request,response);
    }

    protected void reqPro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        // dto.setUserNum(request.getParameter("IndexUserNum"));
        dto.setUserID(request.getParameter("IndexID"));
        dto.setUserPW(request.getParameter("IndexPW"));

        System.out.println("id : " + dto.getUserID());
        System.out.println("PW : " + dto.getUserPW());

        int result = dao.register(dto);
        if(result == -1){
            System.out.println("DataBase Error");
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('아이디와 비밀번호가 일치하지 않습니다.'); " +
                    "location.href='index.jsp';</script>");
            out.flush();
        }else{
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            // Make Session
            HttpSession session = request.getSession();
            session.setAttribute("session", request.getParameter("IndexID"));
            out.println("<script>alert('로그인 되었습니다.'); " +
                    "location.href='MainPage.jsp';</script>");
            out.flush();
        }
    }
}
