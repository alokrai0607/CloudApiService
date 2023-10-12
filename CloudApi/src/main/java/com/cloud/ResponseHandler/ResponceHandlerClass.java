package com.cloud.ResponseHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponceHandlerClass {

	public static ResponseEntity<Object> reponseBuilder(String message, HttpStatus httpStatus, Object respObject) {

		Map<String, Object> response = new HashMap<>();
		response.put("Message", message);
		response.put("httpStatus", httpStatus);
		response.put("Data", respObject);

		return new ResponseEntity<>(response, httpStatus);

	}

}
