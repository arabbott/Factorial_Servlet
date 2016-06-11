/*
 * Class: CMIS440 6980 Advanced Programming in Java (2145)
 * Student Name: Adam Abbott
 * Instructor: Dr. Alla Webb
 * Assignment #: Homework 3
 * Description: Create a servlet to display a table that contains factorials 
 * for the numbers from 0 to 10.
 * Due Date: 6/29/2014
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Sign here: Adam R Abbott
 * Additional Comments: The purpose of this assignment is to create just a 
 * servlet to be called from a web container.
 */
package hw3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FactorialServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head><title>Servlet for Factorials</title></head>");
            out.println("<body>");
            //creates a table to display the output
            out.println("<table border='1' cellspacing='0' cellpadding='1'><tr>");
            out.println("<b><th><tr><td>Number</td>" +
                                   "<td>Factorial</td></tr></th></b>");
            //for statement that creates the factorial number
            for (int n = 0 ; n <= 10 ; n++)
            {
                int factor = 1;
                //for statement that runs the factorial math equation
                for (int i = 1 ; i <= n; i++)
                {
                    factor = factor * i;
                    
                }
                //to print the output into the table
                out.println("<tr><td>" + n + "</td>" +
                               "<td>" + factor + "</td></tr>");                
            }
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            out.flush();
        } 
        finally 
        {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
