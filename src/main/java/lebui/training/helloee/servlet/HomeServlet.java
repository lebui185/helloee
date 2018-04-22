package lebui.training.helloee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lebui.training.helloee.service.StringService;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    private StringService stringService = new StringService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = stringService.toUpper("le bui");
        req.setAttribute("welcomeMessage", "Hello, " + name);
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp");
        dispatcher.forward(req, resp);
    }

}
