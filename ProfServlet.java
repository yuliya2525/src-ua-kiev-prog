package ua.kiev.prog;

import javax.servlet.http.*;
import java.io.IOException;

public class ProfServlet extends HttpServlet {
    private Answers answers = Answers.getInstance();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String yearsS = req.getParameter("age");
        String educationS = req.getParameter("education");

        if (name.isEmpty() || surname.isEmpty() || yearsS.isEmpty()
                || !AgeCheck.isCorrectAge(yearsS) || educationS == null) {
            resp.sendRedirect("index.jsp?correct=0");
        } else {
            int years = Integer.parseInt(yearsS);
            boolean education;
            if ("yes".equals(educationS)) {
                education = true;
            } else {
                education = false;
            }
            String language = req.getParameter("language");

            answers.add(new Users(name, surname, years, education, language));

            resp.sendRedirect("/statistics.jsp");
        }
    }
}
