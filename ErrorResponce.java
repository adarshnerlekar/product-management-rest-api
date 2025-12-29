package com.springrestdatabase2.Exception;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ErrorResponce {
	String msg;
	LocalDateTime timedate;

}
