package com.example._19apc3992;
import jakarta.jws.WebService;

@WebService

public class StringManipulationServiceImpl implements StringManipulationService {

    @Override
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public Integer countCharacters(String text) {
        return text.length();
    }
}
