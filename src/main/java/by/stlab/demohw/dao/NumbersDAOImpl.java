package by.stlab.demohw.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NumbersDAOImpl implements NumbersDAO {

    private static final String PATH_TO_FILE = "D:\\STUDENTS_LAB\\01_servlets\\demohw\\src\\main\\resources\\input.txt";

    @Override
    public ArrayList<Integer> getNumFromFile() {

        ArrayList<Integer> numbers = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(PATH_TO_FILE))) {
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
