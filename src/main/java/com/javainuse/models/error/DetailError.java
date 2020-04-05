package com.javainuse.models.error;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@JsonPropertyOrder({"type","code","targetstatus","message"})
@Setter
@Getter
public class DetailError {
	private String type;
	private int code;
	private String targetstatus;
	private String message;
	
	public DetailError(final ErrorDetailsTypes type, final String targetstatus, final String message)
	{
		this.type = type.getType();
		this.code = type.getCode();
		this.targetstatus = targetstatus;
		this.message = message;
		
	}

}
