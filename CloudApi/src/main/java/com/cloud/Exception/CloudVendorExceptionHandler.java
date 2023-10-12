package com.cloud.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {
 
	@ExceptionHandler(value = {CloudVendorNotFoundException.class})
	public ResponseEntity<Object> handleCloudVrndornotFoundException(
			CloudVendorNotFoundException cloVendorNotFoundException) {

		CloudVendorException cloudVendorException = new CloudVendorException(
				cloVendorNotFoundException.getMessage(),
				cloVendorNotFoundException.getCause(),
				HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);

	}
	

}
