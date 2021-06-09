package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author danny
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String txtTitle = br.readLine();
        String txtContent = br.readLine();
        Note txtNote = new Note(txtTitle, txtContent);
        request.setAttribute("txtNote", txtNote);
        br.close();
        //this will display the requested JSP as a view
        //Get and check for edit parameter
        String parameterCheck = request.getParameter("edit");
        if (parameterCheck == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // to write to a file
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        pw.close();
        //Note person = new Note(title, content);
        //request.setAttribute("person", person);
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

    }

}
