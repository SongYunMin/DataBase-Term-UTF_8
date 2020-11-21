package Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
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
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        System.out.println("id = " + id);
        System.out.println("password = " + password);

        // Saving Data to a Requested Object
        request.setAttribute("id", id);
        request.setAttribute("password", password);

        // RequestDispatcher : Send client requests to the desired resource
        // forward : The role of handing control over to the target resource.
        RequestDispatcher dis = request.getRequestDispatcher("UserInfo.jsp");
        dis.forward(request, response);
    }
}
