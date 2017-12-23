package com.bdqn.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lenovo on 2016/9/24.
 */
@WebServlet(name = "maven",urlPatterns = "/maven")
public class MavenServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer=response.getWriter();
        writer.write("<h1>hello maven</h1>");
        writer.flush();
    }
}
