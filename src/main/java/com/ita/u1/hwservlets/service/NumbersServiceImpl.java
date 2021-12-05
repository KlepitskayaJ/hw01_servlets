package com.ita.u1.hwservlets.service;

import com.ita.u1.hwservlets.dao.NumbersDAOImpl;

import java.util.Collections;
import java.util.List;

public class NumbersServiceImpl implements NumbersService {
    @Override
    public List<Integer> getNumbersFromDAO() {
        NumbersDAOImpl nDao = new NumbersDAOImpl();
        return nDao.getNumFromFile();
    }

    @Override
    public List<Integer> sortArray() {
        List<Integer> array = getNumbersFromDAO();
        Collections.sort(array);
        return array;
    }
}
