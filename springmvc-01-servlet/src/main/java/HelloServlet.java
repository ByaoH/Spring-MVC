import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        if (method.equals("add")){
            request.getSession().setAttribute("msg", "执行了add方法");
        }
        if (method.equals("delete")){
            request.getSession().setAttribute("msg", "执行了delete方法");
        }
        request.getRequestDispatcher("/WEB-INF/jsp/testjsp.jsp").forward(request, response);
    }
}
