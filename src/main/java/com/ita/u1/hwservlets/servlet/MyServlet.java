package com.ita.u1.hwservlets.servlet;

import com.ita.u1.hwservlets.service.NumbersServiceImpl;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    public MyServlet() {
    }

    @Override
    public void init() {;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        NumbersServiceImpl nService = new NumbersServiceImpl();
        List<Integer> numbers = nService.getNumbersFromDAO();

        request.setAttribute("numbers", numbers);
        request.getRequestDispatcher("main.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NumbersServiceImpl nService = new NumbersServiceImpl();
        List<Integer> numbers = nService.sortArray();

        request.setAttribute("sortedNumbers", numbers);
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

    @Override
    public void destroy() {
    }
}