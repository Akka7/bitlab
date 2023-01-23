package kz.bitlab.javaee.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.javaee.db.DBManager;
import kz.bitlab.javaee.db.Task;

import java.io.IOException;

@WebServlet(value = "/Addition")
public class EE_2_4_ADD_TASK extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/AddTask.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String button = request.getParameter("button");

        String TNAME = request.getParameter("T_name");
        String TDESCRIPTION = request.getParameter("T_desc");
        String Tdate = request.getParameter("TDate");
        String CComplete = request.getParameter("YN");


        Task task = new Task();
        task.setName(TNAME);
        task.setDescription(TDESCRIPTION);
        task.setDeadLineDate(Tdate);
        task.setCompletness(CComplete);

        if (button.equals("add")) {
            DBManager.addTask(task);
            response.sendRedirect("/AllTASKS");
        } else {
            response.sendRedirect("/AllTASKS");
        }

    }
}
