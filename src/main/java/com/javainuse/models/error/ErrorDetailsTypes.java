package com.javainuse.models.error;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ErrorDetailsTypes {
	INVALID_VALUE(
			1200,
			"Invalidvalue",
			"Value given is not valid");

	private int code;
	private String type;
	private String message;
}
