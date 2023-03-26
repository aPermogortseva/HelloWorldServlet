package ru.academits.permogortseva;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = -5776036362248579371L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().write("Hello from HelloWorldServlet!".getBytes(StandardCharsets.UTF_8));
        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("message");

        resp.getOutputStream().write("Your message: ".getBytes(StandardCharsets.UTF_8));
        resp.getOutputStream().write(message.getBytes(StandardCharsets.UTF_8));
        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }
}
