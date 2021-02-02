package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int i = 0; i < rowIndex; i++) {
                for (int j = i; j >= 1; j--) {
                    list.set(j, list.get(j - 1) + list.get(j));
                }
                list.add(1);
            }
            return list;
        }
    }

}
