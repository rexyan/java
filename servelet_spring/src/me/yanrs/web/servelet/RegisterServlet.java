package me.yanrs.web.servelet;

import me.yanrs.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取参数
        String username = request.getParameter("username");

         // 取用 ApplicationContext 对象
         ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());

        // 从 Spring 容器获取 userService
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 不能使用这样写法，
        // 如果这么写，那么每次都会从 Spring 容器中获取一个新的 context 对象，所以我们借助 struts2 的加载器，让其在项目启动的
        // 时候就加载 Spring 的 bean，这样每次访问的都是同一个 context

         IUserService userService = (IUserService) context.getBean("userService");
         System.out.println(userService.hashCode());
         userService.add(username);

        // 响应
        response.getWriter().write("register success!");
    }
}
