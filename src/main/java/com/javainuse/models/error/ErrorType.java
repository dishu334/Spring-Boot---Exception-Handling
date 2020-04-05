package com.javainuse.models.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
	
public enum ErrorType {
	INVALID_REQUEST(
			HttpStatus.BAD_REQUEST.value(),
			1000,
			"InvalidRequest",
			"The request is malformed."),
	RESOURCE_NOT_FOUND(
			HttpStatus.NOT_FOUND.value(),
			1404,
			"ResourceNotFound",
			"Resurce not found"
			),
	UNAUTHORIZED_EXCEPTION(
			HttpStatus.UNAUTHORIZED.value(),
			3000,
			"Unauthorized",
			"Unauthorized"			
			);
	
	private int status;
	private int code;
	private String type;
	private String message;
	
}
