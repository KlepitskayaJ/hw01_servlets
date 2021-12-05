package com.ita.u1.hwservlets.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NumbersDAOImpl implements NumbersDAO {
    private static final String PATH_TO_FILE = "input.txt";

    @Override
    public List<Integer> getNumFromFile() {
        List<Integer> numbers = new ArrayList();

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream input = classLoader.getResourceAsStream(PATH_TO_FILE);
             BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
            String str;
            while ((str = br.readLine()) != null) {
                numbers.add(Integer.parseInt(str));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numbers;
    }
}
