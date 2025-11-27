package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PLRunner {
    public static void main(String[] args) {
        List<String> languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("Python");
        languageList.add("C++");
        languageList.add("JavaScript");
        languageList.add("C#");
        languageList.add("Ruby");

        ListIterator<String> langIterator = languageList.listIterator();

        while (langIterator.hasNext()) {
            String lang = langIterator.next();

            if (lang.equals("Python")) {
                langIterator.add("Swift");
            }
            if (lang.equals("C#")) {
                langIterator.add("Go");
            }
            System.out.println(lang);
        }
        System.out.println("Final list of languages===" + languageList);
    }
}