package com.arraylist;


import com.arraylist.domain.tec;

import java.util.ArrayList;

public class array1 {
    public static void main(String[] args) {
        ArrayList<tec> s = new ArrayList<>();
        tec a = new tec(1,2,3);
        tec b = new tec(1,2,3);
        tec c = new tec(1,2,3);
        s.add(a);
        s.add(b);
        s.add(c);
        for (int i = 0; i < s.size(); i++) {
            tec temp = s.get(i);
            System.out.println(temp.getA());
        }
    }

}
