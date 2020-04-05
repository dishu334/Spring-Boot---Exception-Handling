package com.javainuse.models.error;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorResponse {
	
	private final Error error;
	
	public ErrorResponse(final ErrorType errorType)
	{
		this.error = new Error(errorType);
	}

	public ErrorResponse(final ErrorType errorType, final List<DetailError> details)
	{
		this.error = new Error(errorType, details);
	}
	
}
