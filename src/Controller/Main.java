package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Main extends HttpServlet {

  public Main(){
    super();
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
    response.setCharacterEncoding("UTF-8");
    String name = "Yunmin";
    request.setAttribute("name", name);


  }


}
