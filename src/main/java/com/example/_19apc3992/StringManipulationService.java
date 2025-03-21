package com.example._19apc3992;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface StringManipulationService {

    @WebMethod
    String reverseText(String text);

    @WebMethod
    Integer countCharacters(String text);

}