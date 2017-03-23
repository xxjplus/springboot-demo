package cn.xuqplus.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 该类为自定义过滤器
 * 在springboot中可以通过注解方便的定义过滤器
 * ----1.在过滤器类上添加 @WebFilter注解
 * ----2.在springboot启动类上添加 @ServletComponentScan("cn.xuqplus.filter")
 * <p>
 * Created by xuqplus on 17-3-23.
 */
@WebFilter(filterName = "demoFilter", urlPatterns = "/api/filter")
public class DemoFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("filter", "demoFilter");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
