package com.luv2code.springdemo.mvc;


import lombok.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Student
{
    private String firstName;
    private String lastName;
    private String gender;
    private String country;
    private LinkedHashMap <String,String> countryOptions;
    private String favoriteLanguage;
    private LinkedHashMap<String,String> languageOptions;
    private List<String> operatingSystems;

    public Student () {
        // populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","France");
        countryOptions.put("DE","Germany");
        countryOptions.put("IN","India");
        countryOptions.put("US","United States of America");
        countryOptions.put("IT","Italy");

        languageOptions = new LinkedHashMap<>();
        languageOptions.put("Java","Java");
        languageOptions.put("C++","C++");
        languageOptions.put("Python","Python");
        languageOptions.put("Javascript","Javascript");
        languageOptions.put("Assembly","Assembly");
        languageOptions.put("PHP","PHP");
    }
}
