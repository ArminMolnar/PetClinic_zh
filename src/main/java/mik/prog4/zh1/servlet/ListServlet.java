package mik.prog4.zh1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mik.prog4.zh1.repository.PetRepository;
import mik.prog4.zh1.service.PetService;

import java.io.IOException;

public class ListServlet extends HttpServlet {

    private static final PetRepository petRepository = PetRepository.getInstance();
    private static PetService petService = new PetService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("petList", petService.findAll());
        req.getRequestDispatcher("petList.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");

        switch (req.getParameter("action")) {
            case "back":
                resp.sendRedirect("mainServlet");
                break;
            case "delete":
                petRepository.delete(Long.parseLong(req.getParameter("petId")));
                req.setAttribute("petList", petService.findAll());
                req.getRequestDispatcher("petList.jsp").forward(req, resp);
                break;
        }
    }
}
