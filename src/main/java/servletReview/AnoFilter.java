package servletReview;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by Administrator on 2018/4/18 0018.
 */
@WebFilter(urlPatterns = {"/ano"})
public class AnoFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init AnoFilter ...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
           String nam =  request.getParameter("name");
           if("aaa".equals(nam)){
               chain.doFilter(request, response);
               return;
           }
        request.getRequestDispatcher("/hello").forward(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy AnoFilter ...");    }
}
