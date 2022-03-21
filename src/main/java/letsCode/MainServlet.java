package letsCode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.getWriter().write("do get");

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        resp.getWriter().write("service");
    }

    @Override
    public void destroy() {
        super.destroy();
        log("destroy");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        log("init");
    }
}
