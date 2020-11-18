package example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sample")
public class Main extends HttpServlet {
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  // Servlet Class 가 GET 으로 호출되는 경우 doGet Method 를 Override
  // 기본 규칙에 따라 작성
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
      // Create Processing Content
    // TODO Auto-generated method stub
    //①브라우저에 반환할 정보의 문자 코드를 설정
    response.setContentType("text/html; charset=UTF-8");

    //②html 출력
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("</head>");
    out.println("<body>");
    out.println("<p>Hello Java!</p>");
    out.println("</html>");
    out.println("</body>");

    //String content = request.getParameter("content");
    String content = "아 좆같네";
    // setAttribute("데이터 이름", 넘길 데이터)
    request.setAttribute("content", content);
    ServletContext context = getServletContext();
    RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");

    dispatcher.forward(request,response);

  }

  // Servlet Class 가 POST 로 호출되는 경우 doGet Method 를 Override
  // 기본 규칙에 따라 작성
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException{
    // Create Processing Content
  }


}
