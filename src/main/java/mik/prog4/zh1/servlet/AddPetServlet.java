package mik.prog4.zh1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mik.prog4.zh1.entity.Pet;
import mik.prog4.zh1.repository.PetRepository;

import java.io.IOException;

public class AddPetServlet extends HttpServlet {

    private static final PetRepository petRepository = PetRepository.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("addPet.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        var name = req.getParameter("name");
        var chipCode = req.getParameter("chipCode");
        var address = req.getParameter("address");
        var species = req.getParameter("species");
        petRepository.save(new Pet(name, chipCode, address, species));
        resp.sendRedirect( req.getContextPath() + "/listServlet");
    }
}
