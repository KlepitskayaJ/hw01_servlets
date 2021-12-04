package com.ita.u1.hwservlets.service;

import com.ita.u1.hwservlets.dao.NumbersDAOImpl;

import java.util.ArrayList;
import java.util.Collections;

public class NumbersServiceImpl implements NumbersService {
    @Override
    public ArrayList<Integer> getNumbersFromDAO() {
        NumbersDAOImpl nDao = new NumbersDAOImpl();
        return nDao.getNumFromFile();
    }

    @Override
    public ArrayList<Integer> sortArray() {
        ArrayList<Integer> array = getNumbersFromDAO();
        Collections.sort(array);
        return array;
    }
}
