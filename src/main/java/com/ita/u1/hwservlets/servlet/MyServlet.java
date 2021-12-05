package com.ita.u1.hwservlets.servlet;

import com.ita.u1.hwservlets.dao.NumbersDAO;
import com.ita.u1.hwservlets.dao.NumbersDAOImpl;
import com.ita.u1.hwservlets.service.NumbersService;
import com.ita.u1.hwservlets.service.NumbersServiceImpl;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    public MyServlet() {
    }

    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        NumbersDAO nDao = new NumbersDAOImpl();
        NumbersService nService = new NumbersServiceImpl(nDao);
        List<Integer> numbers = nService.getNumbersFromDAO();

        request.setAttribute("numbers", numbers);
        request.getRequestDispatcher("main.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NumbersDAO nDao = new NumbersDAOImpl();
        NumbersService nService = new NumbersServiceImpl(nDao);
        List<Integer> numbers = nService.sortArray();

        request.setAttribute("sortedNumbers", numbers);
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

    @Override
    public void destroy() {
    }
}