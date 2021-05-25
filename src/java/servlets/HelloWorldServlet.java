
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //this will display the requested JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //capture the parameters from the POST request j(the form)
        String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        
        //set the attributes for the JSP
        request.setAttribute("firstName", firstname);
        request.setAttribute("lastName", lastname);
        
        //display the helloWorldJSP
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorld.jsp");
        
    }

}