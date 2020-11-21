package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Annotation Mapping
@WebServlet("/Main")
public class MainPageServlet extends HttpServlet {

  public MainPageServlet(){
    super();
  }

  // Servlet Class 가 GET 으로 호출되는 경우 doGet Method 를 Override
  // 기본 규칙에 따라 작성
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
      // Create Processing Content
      reqPro(request,response);
  }

  // Servlet Class 가 POST 로 호출 되는 경우 doGet Method 를 Override
  // 기본 규칙에 따라 작성
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException{
    // Create Processing Content
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
