package com.springrestdatabase2.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppaException 
{
	@ExceptionHandler
	public ResponseEntity<ErrorResponce> HandleException(Exception e)
	{
		ErrorResponce error=new ErrorResponce();
		error.setMsg(e.getMessage());
		error.setTimedate(LocalDateTime.now());
		return new ResponseEntity<ErrorResponce>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
