package servletReview;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/4/18 0018.
 */
public class OOServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 拿到请求 果断先设置一下字符编码
        req.setCharacterEncoding("UTF-8");
        //呵呵其实没啥消息,处理个毛线
        String name = (String) req.getParameter("name");
        //返回一个hello完事
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<p>hello: " + name +"<p>");
        out.close();
    }
}
