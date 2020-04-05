package com.javainuse.models.error;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public final class Error {

	/*http related sub data*/
	
	/*Specific code error*/
	private final Integer status;
	
	private final String type;
	
	private final Integer code;
	
	private final String message;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<DetailError> errordetails;
	
	Error(final ErrorType type)
	{
		this(type.getStatus(), type.getType(), type.getCode(), type.getMessage());
	}
	Error(final ErrorType type, final List<DetailError> details)
	{
		this(type);
		
		this.errordetails = details;
	}
}


