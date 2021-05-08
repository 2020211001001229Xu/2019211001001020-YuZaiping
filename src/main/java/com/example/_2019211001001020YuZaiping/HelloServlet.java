package com.example._2019211001001020YuZaiping;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")//url
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        System.out.println("i am HelloServlet -->doGet()");//when called?
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        //at last response goes back to filter
    }

    public void destroy() {
    }
}