package com.obtaincare.API.apiHelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectConverter {

    private static ObjectMapper objectMapper = new ObjectMapper();


    public static <T> T convertJsonObjectToJavaObject(String jsonPayload, Class<T> clazz ) throws JsonProcessingException {
       return objectMapper.readValue(jsonPayload,clazz);
    }


}
