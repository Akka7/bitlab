package kz.bitlab.javaee.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.javaee.db.DBManager;
import kz.bitlab.javaee.db.Task;

import java.io.IOException;

@WebServlet(value = "/TasksDetails")
public class Details2_4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idshka = request.getParameter("id");
        int idDd = 0;
        try {
            idDd = (int) Long.parseLong(idshka);
        } catch (Exception e) {

        }

        Task task = DBManager.getTask(Long.valueOf(idDd));
        request.setAttribute("ttsk", task);

        request.getRequestDispatcher("/Details.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String idshka = request.getParameter("id");
        String TTNAME = request.getParameter("nname");
        String TTDESCRIPTION = request.getParameter("Descrition");
        String TTdate = request.getParameter("deadline");
        String CComplete = request.getParameter("YN");

        if (action.equals("save")) {

            DBManager.updateTask(Long.valueOf(idshka), TTNAME, TTDESCRIPTION, TTdate,CComplete);
            response.sendRedirect("/AllTASKS");

        } else{
            DBManager.deleteTask(Integer.parseInt(idshka));
            response.sendRedirect("/AllTASKS");
        }

    }
}