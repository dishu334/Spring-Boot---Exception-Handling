package com.javainuse.services.config;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import lombok.val;

@Component
public class RestTemplatesErrorHandler implements ResponseErrorHandler {

	private static final List<HttpStatus> httpsuccess = Arrays.asList(HttpStatus.OK, HttpStatus.CREATED);

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		// TODO Auto-generated method stub
		return !httpsuccess.contains(response.getRawStatusCode());

	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		// TODO Auto-generated method stub
		val statusCode = response.getStatusCode();
/*		switch(statusCode)
		{
		
		case BAD_REQUEST:
			throw new BadRequestException();
			*/			
			
		
		}		
	}


