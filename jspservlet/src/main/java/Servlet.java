import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName Servlet
 * @Description TODO
 * @Author L
 * @Date 2019/7/31 20:32
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String str = "Hello World";
        req.setAttribute("strKey",str);
        req.getRequestDispatcher("select.jsp").forward(req, resp);
    }
}
