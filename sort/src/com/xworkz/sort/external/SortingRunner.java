package com.xworkz.sort.external;

import com.xworkz.sort.dto.DetailsDto;

import java.util.*;
import java.util.stream.Collectors;

public class SortingRunner {
    public static void main(String[] args) {
        Comparator<DetailsDto> comparator1 =(o1, o2) -> o1.getName().compareTo(o2.getName());

        List<DetailsDto> list = new ArrayList<DetailsDto>();
        list.add (new  DetailsDto(119,"Sanju"));
        list.add (new  DetailsDto(152,"Theja"));
        list.add(new DetailsDto(97,"PT"));

        Collections.sort(list);
        System.out.println(list);

    }
}
