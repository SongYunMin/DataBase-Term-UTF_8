package Controller;

import DAO.NewAccountDAO;
import DTO.NewAccountDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/NewAccountServlet")
public class NewAccountServlet extends HttpServlet {
    private NewAccountDAO dao = new NewAccountDAO();
    private NewAccountDTO dto = new NewAccountDTO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reqPro(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reqPro(request, response);
    }

    protected void reqPro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newAccountName = request.getParameter("NewAccountName");
        String newAccountID = request.getParameter("NewAccountID");
        String newAccountPW = request.getParameter("NewAccountPW");
        String newAccountPW_ = request.getParameter("NewAccountPW_");

//        // Test Code
//        System.out.println("testName = " + newAccountName);
//        System.out.println("testID = " + newAccountID);
//        System.out.println("testPW = " + newAccountPW);
//        System.out.println("testPW_ = " + newAccountPW_);

        // Saving Data to a Requested Object
        request.setAttribute("NewAccountName", newAccountName);
        request.setAttribute("NewAccountID", newAccountID);
        request.setAttribute("NewAccountPW", newAccountPW);
        request.setAttribute("NewAccountPW_",newAccountPW_);
        String Test = "Hi I'm Test";

        request.setAttribute("Test",Test);

        // !PW Exception Processing
        if(!newAccountPW.equals(newAccountPW_)){
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('비밀번호와 확인이 서로 일치하지 않습니다.'); " +
                    "location.href='NewAccount.jsp';</script>");
            out.flush();
        }else{
            dto.setUserName(request.getParameter("NewAccountName"));
            dto.setUserID(request.getParameter("NewAccountID"));
            dto.setUserPW(request.getParameter("NewAccountPW"));

            int result = dao.register(dto);
            if(result == -1){
                System.out.println("DataBase Error");
                response.setContentType("text/html; charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.println("<script>alert('DataBase Error!!'); " +
                        "location.href='NewAccount.jsp';</script>");
                out.flush();
            }else{
                response.setContentType("text/html; charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.println("<script>alert('회원가입이 완료되었습니다!'); " +
                        "location.href='index.jsp';</script>");
                out.flush();
            }
        }

//        // RequestDispatcher : Send client requests to the desired resource
//        // forward : The role of handing control over to the target resource.
//        RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
//        dis.forward(request, response);
    }
}
