import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-12
 * Time:13:53
 * 一万年太久，只争朝夕，加油
 */
public class CalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String astr=req.getParameter("a");
        String bstr=req.getParameter("b");
        int a=Integer.parseInt(astr);
        int b=Integer.parseInt(bstr);
        resp.setContentType("text/html;charset=utf-8");
        Writer writer=resp.getWriter();
        int result=a+b;
        writer.write("result="+result);

    }
}
