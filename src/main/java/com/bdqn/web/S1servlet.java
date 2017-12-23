package com.bdqn.web;

import org.apache.log4j.Logger;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lenovo on 2016/10/15.
 */

public class S1servlet extends HttpServlet {
    private static final Logger logger=Logger.getLogger(S1servlet.class);
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info(request.getRemoteAddr());
        PrintWriter writer=response.getWriter();
        writer.print("<h1>s2</h1>");
        writer.close();
    }
}
