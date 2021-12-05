package com.ita.u1.hwservlets.service;

import com.ita.u1.hwservlets.dao.NumbersDAO;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class NumbersServiceImpl implements NumbersService {
    private final NumbersDAO nDao;

    public NumbersServiceImpl(NumbersDAO nDao) {
        this.nDao = nDao;
    }

    @Override
    public List<Integer> getNumbersFromDAO() {
        return nDao.getNumFromFile();
    }

    @Override
    public List<Integer> sortArray() {
        List<Integer> array = getNumbersFromDAO();
        Collections.sort(array);
        return array;
    }
}
