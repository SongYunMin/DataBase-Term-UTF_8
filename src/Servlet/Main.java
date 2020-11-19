package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


public class Main extends HttpServlet {

  public Main(){
    super();
  }


  protected void processRequest(HttpServletResponse response, HttpServletRequest request)
    throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      try(PrintWriter out = response.getWriter()){

      }


  }

  // Servlet Class 가 GET 으로 호출되는 경우 doGet Method 를 Override
  // 기본 규칙에 따라 작성
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
      // Create Processing Content
    doPost(request,response);
  }

  // Servlet Class 가 POST 로 호출되는 경우 doGet Method 를 Override
  // 기본 규칙에 따라 작성
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException{
    // Create Processing Content
    response.setContentType("text/html;charset=UTF-8");

    String data = request.getParameter("data");
    data = "hi";
    response.sendRedirect("index.jsp?data="+data);


    PrintWriter out = response.getWriter();

    out.println("<HTML>");
    out.println("<body><H3>핼로월드</H3></body<");
    out.println("</HTML>");
  }


}
