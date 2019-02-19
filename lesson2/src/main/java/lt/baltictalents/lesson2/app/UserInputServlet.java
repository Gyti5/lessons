package lt.baltictalents.lesson2.app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

@WebServlet(name="UserInputServlet", value="/user-input/*")
public class UserInputServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/user-input.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        String year = request.getParameter("year");
        String engine = request.getParameter("engine");
        String make = request.getParameter("make");
        String power = request.getParameter("power");


        UserInfoBean userInfoBean = new UserInfoBean();

        userInfoBean.settype(type);
        userInfoBean.setyear(year);
        userInfoBean.setmake(make);
        userInfoBean.setengine(engine);
        userInfoBean.setpower(power);

        request.setAttribute("userInfoBean", userInfoBean);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/user-info.jsp");
        requestDispatcher.forward(request, response);
    }
}
