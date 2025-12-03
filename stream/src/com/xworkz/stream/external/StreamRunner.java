package com.xworkz.stream.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRunner {
    public static void main(String[] args) {

        List<Integer> name = new ArrayList<>(Arrays.asList(1233455,324,535643,13414));
        List<Integer> resul = name.stream().sorted().collect(Collectors.toList());
        resul.forEach(n-> System.out.println(n));
        System.out.println("---------------");

        List<Integer> nam = new ArrayList<>(Arrays.asList(1233455,324,535643,13414));
        List<Integer> resu = nam.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        resu.forEach(n-> System.out.println(n));
        System.out.println("---------------");

        List<Integer> nae = new ArrayList<>(Arrays.asList(1233455,324,535643,13414,23432,076));
        List<Integer> res = nae.stream().filter(n->n%2==0).collect(Collectors.toList());
        res.forEach(n-> System.out.println(n));
        System.out.println("---------------");

        List<Integer> na = new ArrayList<>(Arrays.asList(1233455,324,535643,13414,7469,07765));
        List<Integer> re = na.stream().filter(n->n%2!=0).collect(Collectors.toList());
        re.forEach(n-> System.out.println(n));
        System.out.println("---------------");

        List<String> names = new ArrayList<>(Arrays.asList("PT", "Sanju", "Theja"));
        List<String> result = names.stream().filter(n -> n.contains("T")).collect(Collectors.toList());
        result.forEach(n-> System.out.println(n));
        System.out.println("---------------");

        List<String> the = new ArrayList<>(Arrays.asList("Sanju","Theja","Manu","PT"));
        List<String> san = the.stream().sorted().collect(Collectors.toList());
        san.forEach(n-> System.out.println(n));
        System.out.println("---------------");


        List<String> th = new ArrayList<>(Arrays.asList("Sanju","Theja","Manu","PT"));
        List<String> sa = th.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sa.forEach(n-> System.out.println(n));
        System.out.println("---------------");


        List<Long> naw = new ArrayList<>(Arrays.asList(9384624136L,8465342645L,535643L,13414L,7469L,07765L));
        List<Long> req = naw.stream().filter(n->n%2!=0).collect(Collectors.toList());
        req.forEach(n-> System.out.println(n));
        System.out.println("---------------");



    }
}
