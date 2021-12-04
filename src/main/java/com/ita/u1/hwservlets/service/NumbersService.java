package com.ita.u1.hwservlets.service;

import java.util.List;

public interface NumbersService {
    List<Integer> getNumbersFromDAO();

    List<Integer> sortArray();
}
